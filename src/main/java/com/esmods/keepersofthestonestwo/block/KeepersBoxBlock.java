
package com.esmods.keepersofthestonestwo.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.esmods.keepersofthestonestwo.procedures.KeepersBoxUsloviieRazmieshchieniiaBlokaProcedure;
import com.esmods.keepersofthestonestwo.procedures.KeepersBoxPriShchielchkiePKMPoBlokuProcedure;

public class KeepersBoxBlock extends Block implements SimpleWaterloggedBlock {
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public KeepersBoxBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2.5f, 5000f).requiresCorrectToolForDrops().noOcclusion().pushReaction(PushReaction.DESTROY)
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(4, 0, 1, 12, 8, 15), box(1, 0, 4, 4, 8, 12), box(12, 0, 4, 15, 8, 12), box(12.14017, 0, 4.16161, 15.14017, 8, 7.16161), box(10.96859, 0, 3.99004, 12.96859, 8, 6.99004), box(3.03141, 0, 3.99004, 5.03141, 8, 6.99004),
				box(0.85983, 0, 4.16161, 3.85983, 8, 7.16161), box(3.03141, 0, 9.00996, 5.03141, 8, 12.00996), box(0.85983, 0, 8.83839, 3.85983, 8, 11.83839), box(10.96859, 0, 9.00996, 12.96859, 8, 12.00996),
				box(12.14017, 0, 8.83839, 15.14017, 8, 11.83839), box(4, 8, 1, 12, 10, 15), box(1, 8, 4, 4, 10, 12), box(12, 8, 4, 15, 10, 12), box(12.14017, 8, 4.16161, 15.14017, 10, 7.16161), box(10.96859, 8, 3.99004, 12.96859, 10, 6.99004),
				box(3.03141, 8, 3.99004, 5.03141, 10, 6.99004), box(0.85983, 8, 4.16161, 3.85983, 10, 7.16161), box(3.03141, 8, 9.00996, 5.03141, 10, 12.00996), box(0.85983, 8, 8.83839, 3.85983, 10, 11.83839),
				box(10.96859, 8, 9.00996, 12.96859, 10, 12.00996), box(12.14017, 8, 8.83839, 15.14017, 10, 11.83839));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(WATERLOGGED, flag);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return KeepersBoxUsloviieRazmieshchieniiaBlokaProcedure.execute(world, x, y, z);
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return !state.canSurvive(world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		KeepersBoxPriShchielchkiePKMPoBlokuProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
