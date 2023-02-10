
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vroomsystemsinc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.vroomsystemsinc.block.Vroomliquifier3Block;
import net.mcreator.vroomsystemsinc.block.Vroomjuice2Block;
import net.mcreator.vroomsystemsinc.block.Vroomcretev3Block;
import net.mcreator.vroomsystemsinc.block.Vroomcreteslabv1Block;
import net.mcreator.vroomsystemsinc.block.VroomcretebBlock;
import net.mcreator.vroomsystemsinc.block.VroomJuiceBlock;
import net.mcreator.vroomsystemsinc.block.VroomGenerator3Block;
import net.mcreator.vroomsystemsinc.VroomSystemsIncMod;

public class VroomSystemsIncModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VroomSystemsIncMod.MODID);
	public static final RegistryObject<Block> VROOM_JUICE = REGISTRY.register("vroom_juice", () -> new VroomJuiceBlock());
	public static final RegistryObject<Block> VROOMCRETEB = REGISTRY.register("vroomcreteb", () -> new VroomcretebBlock());
	public static final RegistryObject<Block> VROOMJUICE_2 = REGISTRY.register("vroomjuice_2", () -> new Vroomjuice2Block());
	public static final RegistryObject<Block> VROOMCRETEV_3 = REGISTRY.register("vroomcretev_3", () -> new Vroomcretev3Block());
	public static final RegistryObject<Block> VROOMCRETESLABV_1 = REGISTRY.register("vroomcreteslabv_1", () -> new Vroomcreteslabv1Block());
	public static final RegistryObject<Block> VROOM_GENERATOR_3 = REGISTRY.register("vroom_generator_3", () -> new VroomGenerator3Block());
	public static final RegistryObject<Block> VROOMLIQUIFIER_3 = REGISTRY.register("vroomliquifier_3", () -> new Vroomliquifier3Block());
}
