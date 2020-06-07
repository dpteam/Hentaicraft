
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
public class ItemVulgarium extends ElementsNSFW.ModElement {
	@GameRegistry.ObjectHolder("nsfw:vulgariumhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nsfw:vulgariumbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nsfw:vulgariumlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nsfw:vulgariumboots")
	public static final Item boots = null;
	public ItemVulgarium(ElementsNSFW instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("VULGARIUM", "nsfw:vulgarium_", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.ghast.scream")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("vulgariumhelmet")
				.setRegistryName("vulgariumhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("vulgariumbody")
				.setRegistryName("vulgariumbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("vulgariumlegs")
				.setRegistryName("vulgariumlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("vulgariumboots")
				.setRegistryName("vulgariumboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("nsfw:vulgariumhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("nsfw:vulgariumbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("nsfw:vulgariumlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nsfw:vulgariumboots", "inventory"));
	}
}
