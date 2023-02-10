
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vroomsystemsinc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.vroomsystemsinc.fluid.VroomJuiceFluid;
import net.mcreator.vroomsystemsinc.VroomSystemsIncMod;

public class VroomSystemsIncModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, VroomSystemsIncMod.MODID);
	public static final RegistryObject<Fluid> VROOM_JUICE = REGISTRY.register("vroom_juice", () -> new VroomJuiceFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_VROOM_JUICE = REGISTRY.register("flowing_vroom_juice", () -> new VroomJuiceFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(VROOM_JUICE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VROOM_JUICE.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
