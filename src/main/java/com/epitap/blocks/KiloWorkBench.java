//package com.epitap.blocks;
//
//import net.minecraft.ChatFormatting;
//import net.minecraft.core.BlockPos;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.Containers;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResult;
//import net.minecraft.world.MenuProvider;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.TooltipFlag;
//import net.minecraft.world.item.context.BlockPlaceContext;
//import net.minecraft.world.level.BlockGetter;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.EntityBlock;
//import net.minecraft.world.level.block.SoundType;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntityTicker;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.block.state.properties.BlockStateProperties;
//import net.minecraft.world.level.material.Material;
//import net.minecraft.world.phys.BlockHitResult;
//import net.minecraftforge.fmllegacy.network.NetworkHooks;
//
//import javax.annotation.Nullable;
//import java.util.List;
//
//public class KiloWorkBench extends Block implements EntityBlock {
//    public KiloWorkBench() {
//        super(Properties.of(Material.METAL)
//                .sound(SoundType.METAL)
//                .strength(3.0f));
//    }
//
//
//
//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> list, TooltipFlag flags) {
//        list.add(new TranslatableComponent("message.thermal_power_generator").withStyle(ChatFormatting.WHITE));
//    }
//
//    @Nullable
//    @Override
//    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
//        return new KiloWorkBenchBE(pos, state);
//    }
//
//    @Nullable
//    @Override
//    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type){
//        if(level.isClientSide()){
//            return null;
//        }else{
//            return (level1,pos,state1,tile)->{
//                if(tile instanceof KiloWorkBenchBE generator){
//                }
//            };
//        }
//    }
//    @Override
//    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult trace) {
//        if (!level.isClientSide()) {
//            var tile = level.getBlockEntity(pos);
//
//            if (tile instanceof KiloWorkBenchBE table)
//                player.openMenu(table);
//        }
//
//        return InteractionResult.SUCCESS;
//    }
//
//    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
//        if (state.getBlock() != newState.getBlock()) {
//            var tile = level.getBlockEntity(pos);
//
//            if (tile instanceof KiloWorkBenchBE table) {
//                Containers.dropContents(level, pos, table.getInventory().getStacks());
//            }
//        }
//
//        super.onRemove(state, level, pos, newState, isMoving);
//    }
//}
