package com.shnupbups.allthethings.utility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.shnupbups.allthethings.item.ItemBasic;
import com.shnupbups.allthethings.item.ItemMaterial;

public class ColourHelper {
    //thanks JABBA
    public static int getAverageColour(ResourceLocation location, boolean transparent, boolean item) {
        ResourceLocation texture = new ResourceLocation(location.getResourceDomain(), String.format("%s/%s%s", new Object[] {(item ? "textures/items":"textures/blocks"), location.getResourcePath(), ".png"}));
        int[] pixels = null;
        try {
            pixels = TextureUtil.readImageData(Minecraft.getMinecraft().getResourceManager(), texture);
        } catch(Throwable t) {
            LogHelper.warn("Error reading image data for location: "+texture.getResourcePath());
        }
        PixelARGB totals = new PixelARGB(0);
        for(int pixel: pixels) {
            if(transparent) totals.alphaAdd(new PixelARGB(pixel));
            else totals.addSkipTransparent(new PixelARGB(pixel));
        }
        if(transparent) totals = totals.normalize();
        else totals = totals.normalizeIgnoreAlpha();
        return totals.combined;
    }

    public static int getAverageColour(ResourceLocation texture, boolean item) {
        return getAverageColour(texture, false, item);
    }

    public static int getAverageColour(ResourceLocation texture) {
        return getAverageColour(texture, false, true);
    }
    
    public static int getAverageColour(String texture) {
        return getAverageColour(new ResourceLocation(texture));
    }
    
    public static int getAverageColour(Item item) {
        return getAverageColour(item,0);
    }
    
    public static int getAverageColour(Item item, int meta) {
        return getAverageColour(item.getIcon(new ItemStack(item), 0).getIconName());
    }
    
    public static int getAverageColour(ItemBasic item) {
        return getAverageColour(item.getTextureString());
    }
    
    public static int getAverageColour(ItemMaterial item) {
        return item.getColour();
    }

    private static class PixelARGB {
        int A, R, G, B;
        int combined;
        private int addCount = 0;

        PixelARGB(final int pixel) {
            A = (pixel >> 24) & 0xFF;
            R = (pixel >> 16) & 0xFF;
            G = (pixel >> 8) & 0xFF;
            B = pixel & 0xFF;
            combined = pixel;
        }

        PixelARGB(final int alpha, final int red, final int green, final int blue) {
            A = alpha;
            R = red;
            G = green;
            B = blue;
            combined = ((A & 0xFF) << 24) + ((R & 0xFF) << 16) + ((G & 0xFF) << 8) + (B & 0xFF);
        }

        PixelARGB alphaAdd(PixelARGB add) {
            addCount++;
            A += add.A;
            R += (add.R * add.A) / 255;
            G += (add.G * add.G) / 255;
            B += (add.B * add.B) / 255;
            combined = ((A & 0xFF) << 24) + ((R & 0xFF) << 16) + ((G & 0xFF) << 8) + (B & 0xFF);
            return this;
        }

        PixelARGB normalize() {
            if (addCount == 0) return this;
            R = R * 255 / A;
            G = G * 255 / A;
            B = B * 255 / A;
            A = A / addCount;
            combined = ((A & 0xFF) << 24) + ((R & 0xFF) << 16) + ((G & 0xFF) << 8) + (B & 0xFF);
            addCount = 0;
            return this;
        }

        PixelARGB addIgnoreAlpha(PixelARGB add) {
            addCount++;
            R += add.R;
            G += add.G;
            B += add.B;
            combined = ((A & 0xFF) << 24) + ((R & 0xFF) << 16) + ((G & 0xFF) << 8) + (B & 0xFF);
            return this;
        }

        PixelARGB addSkipTransparent(PixelARGB add) {
            if (add.A == 0)
                return this;
            addCount++;
            R += add.R;
            G += add.G;
            B += add.B;
            combined = ((A & 0xFF) << 24) + ((R & 0xFF) << 16) + ((G & 0xFF) << 8) + (B & 0xFF);
            return this;
        }

        PixelARGB normalizeIgnoreAlpha() {
            if (addCount == 0) return this;
            R = R / addCount;
            G = G / addCount;
            B = B / addCount;
            combined = ((A & 0xFF) << 24) + ((R & 0xFF) << 16) + ((G & 0xFF) << 8) + (B & 0xFF);
            addCount = 0;
            return this;
        }

        PixelARGB YIQContrastTextColor() {
            int color = (((R * 299) + (G * 587) + (B * 114)) / 1000) >= 128 ? 0: 255;
            return new PixelARGB(255, color, color, color);
        }
    }
}
