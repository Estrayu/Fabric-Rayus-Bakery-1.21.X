package net.rayusbakery.modid.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import org.jetbrains.annotations.Nullable;

public class Cutting_Board extends HorizontalFacingBlock {

    public static final MapCodec<Cutting_Board> CODEC = createCodec(Cutting_Board::new);

    public Cutting_Board(Settings settings){
        super(settings);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec(){
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx){
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(FACING);
    }
}
