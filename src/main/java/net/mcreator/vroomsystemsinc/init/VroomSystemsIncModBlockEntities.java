
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vroomsystemsinc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.vroomsystemsinc.block.entity.Vroomliquifier3BlockEntity;
import net.mcreator.vroomsystemsinc.block.entity.Vroomcretev3BlockEntity;
import net.mcreator.vroomsystemsinc.block.entity.VroomGenerator3BlockEntity;
import net.mcreator.vroomsystemsinc.VroomSystemsIncMod;

public class VroomSystemsIncModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			VroomSystemsIncMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> VROOMCRETEV_3 = register("vroomcretev_3", VroomSystemsIncModBlocks.VROOMCRETEV_3,
			Vroomcretev3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VROOM_GENERATOR_3 = register("vroom_generator_3",
			VroomSystemsIncModBlocks.VROOM_GENERATOR_3, VroomGenerator3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VROOMLIQUIFIER_3 = register("vroomliquifier_3", VroomSystemsIncModBlocks.VROOMLIQUIFIER_3,
			Vroomliquifier3BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
