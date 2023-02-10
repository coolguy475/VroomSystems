
package net.mcreator.vroomsystemsinc.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.vroomsystemsinc.init.VroomSystemsIncModItems;
import net.mcreator.vroomsystemsinc.init.VroomSystemsIncModFluids;
import net.mcreator.vroomsystemsinc.init.VroomSystemsIncModBlocks;

public abstract class VroomJuiceFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(VroomSystemsIncModFluids.VROOM_JUICE,
			VroomSystemsIncModFluids.FLOWING_VROOM_JUICE,
			FluidAttributes
					.builder(new ResourceLocation("vroom_systems_inc:blocks/vroomjuiceat"),
							new ResourceLocation("vroom_systems_inc:blocks/vroomjuicerf"))

					.density(0).viscosity(500)

					.rarity(Rarity.UNCOMMON))
			.explosionResistance(100f).canMultiply().tickRate(3)

			.bucket(VroomSystemsIncModItems.VROOM_JUICE_BUCKET).block(() -> (LiquidBlock) VroomSystemsIncModBlocks.VROOM_JUICE.get());

	private VroomJuiceFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(20);
	}

	public static class Source extends VroomJuiceFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends VroomJuiceFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
