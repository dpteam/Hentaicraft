
package io.alaska.nsfw.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import io.alaska.nsfw.ElementsNSFW;

@ElementsNSFW.ModElement.Tag
public class ItemVulgariumArmor extends ElementsNSFW.ModElement {
	@GameRegistry.ObjectHolder("nsfw:vulgariumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nsfw:vulgariumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nsfw:vulgariumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nsfw:vulgariumarmorboots")
	public static final Item boots = null;
	public ItemVulgariumArmor(ElementsNSFW instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("VULGARIUMARMOR", "nsfw:vulgarium_", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.ghast.scream")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("vulgariumarmorhelmet")
				.setRegistryName("vulgariumarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("vulgariumarmorbody")
				.setRegistryName("vulgariumarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("vulgariumarmorlegs")
				.setRegistryName("vulgariumarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("vulgariumarmorboots")
				.setRegistryName("vulgariumarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("nsfw:vulgariumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("nsfw:vulgariumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("nsfw:vulgariumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nsfw:vulgariumarmorboots", "inventory"));
	}
}
