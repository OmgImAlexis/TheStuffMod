package omgimalexis.allthethings.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import omgimalexis.allthethings.lib.Strings;

public class ItemArmor extends net.minecraft.item.ItemArmor {
	
	ModItems item = new omgimalexis.allthethings.item.ModItems();

	public ItemArmor(ArmorMaterial material, int p_i45325_2_, int p_i45325_3_) {
		super(material, p_i45325_2_, p_i45325_3_);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == item.ruby_helmet || stack.getItem() == item.ruby_pants || stack.getItem() == item.ruby_boots) {
			return Strings.MODID + ":textures/armor/TutArmor1.png";
		} else if (stack.getItem() == item.ruby_pants) {
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
			if(helmet.getItem() == ModItems.ruby_helmet && plate.getItem() == ModItems.ruby_plate && pants.getItem() == ModItems.ruby_pants){
				//player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
				player.capabilities.allowFlying = true;
			}
		}

	}
	
}
