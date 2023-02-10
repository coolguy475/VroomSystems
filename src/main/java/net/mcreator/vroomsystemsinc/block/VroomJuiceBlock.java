
package net.mcreator.vroomsystemsinc.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.vroomsystemsinc.init.VroomSystemsIncModFluids;

public class VroomJuiceBlock extends LiquidBlock {
	public VroomJuiceBlock() {
		super(() -> (FlowingFluid) VroomSystemsIncModFluids.VROOM_JUICE.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_LIGHT_GREEN).strength(100f)

		);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}
}
