
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vroomsystemsinc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.vroomsystemsinc.item.VroomRubberItem;
import net.mcreator.vroomsystemsinc.item.VroomMeterItem;
import net.mcreator.vroomsystemsinc.item.VroomJuiceItem;
import net.mcreator.vroomsystemsinc.VroomSystemsIncMod;

public class VroomSystemsIncModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VroomSystemsIncMod.MODID);
	public static final RegistryObject<Item> VROOM_JUICE_BUCKET = REGISTRY.register("vroom_juice_bucket", () -> new VroomJuiceItem());
	public static final RegistryObject<Item> VROOMCRETEB = block(VroomSystemsIncModBlocks.VROOMCRETEB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VROOMJUICE_2 = block(VroomSystemsIncModBlocks.VROOMJUICE_2, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VROOMCRETEV_3 = block(VroomSystemsIncModBlocks.VROOMCRETEV_3, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VROOM_RUBBER = REGISTRY.register("vroom_rubber", () -> new VroomRubberItem());
	public static final RegistryObject<Item> VROOMCRETESLABV_1 = block(VroomSystemsIncModBlocks.VROOMCRETESLABV_1,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VROOM_GENERATOR_3 = block(VroomSystemsIncModBlocks.VROOM_GENERATOR_3, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> VROOM_METER = REGISTRY.register("vroom_meter", () -> new VroomMeterItem());
	public static final RegistryObject<Item> VROOMLIQUIFIER_3 = block(VroomSystemsIncModBlocks.VROOMLIQUIFIER_3, CreativeModeTab.TAB_REDSTONE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
