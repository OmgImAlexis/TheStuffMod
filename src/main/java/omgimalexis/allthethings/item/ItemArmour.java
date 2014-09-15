package omgimalexis.allthethings.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import omgimalexis.allthethings.lib.Strings;

public class ItemArmour extends net.minecraft.item.ItemArmor {

	public ItemArmour(ArmorMaterial material, int p_i45325_2_, int p_i45325_3_) {
		super(material, p_i45325_2_, p_i45325_3_);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == Items.tutHelmet || stack.getItem() == Items.tutPlate || stack.getItem() == Items.tutBoots) {
			return Strings.MODID + ":textures/armor/TutArmor1.png";
		} else if (stack.getItem() == Items.tutPants) {
			return Strings.MODID + ":textures/armor/TutArmor2.png";
		} else {
			return null;
		}
	}

	/**
	 * Called to tick armor in the armor slot. Override to do something
	 * 
	 * @param world
	 * @param player
	 * @param itemStack
	 */
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null){
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack plate = player.getCurrentArmor(2);
			ItemStack pants = player.getCurrentArmor(1);
			if(helmet.getItem() == Items.tutHelmet && plate.getItem() == Items.tutPlate && pants.getItem() == Items.tutPants){
				//player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
				player.capabilities.allowFlying = true;
			}
		}
		
		if(player.getCurrentArmor(0) != null){
			ItemStack boots = player.getCurrentArmor(0);
			if(boots.getItem() == Items.tutBoots){
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 100, 1));
			}
		}
	}

}
