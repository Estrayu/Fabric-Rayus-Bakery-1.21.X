package net.rayusbakery.modid.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class Chopping_Board extends Block {

    public Chopping_Board(Settings settings){
        super(settings);
    }

    //custom functionality component
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit){
        if(!world.isClient){
            player.sendMessage(Text.literal("Hello, world!"), false);
        }

        return ActionResult.SUCCESS;
    }

    //custom  voxelShape component
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
        return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.0f, 0.5f);
    }


}
