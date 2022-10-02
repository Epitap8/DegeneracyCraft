//package com.epitap.blocks;
//
//import com.epitap.inventory.LargerItemStackHandler;
//import com.epitap.setup.Registration;
//import net.minecraft.core.BlockPos;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.network.Connection;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
//import net.minecraft.world.MenuProvider;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.phys.AABB;
//import net.minecraftforge.client.model.data.IModelData;
//import net.minecraftforge.common.capabilities.Capability;
//import net.minecraftforge.common.util.LazyOptional;
//
//import javax.annotation.Nonnull;
//import javax.annotation.Nullable;
//
//public class KiloWorkBenchBE extends BlockEntity implements MenuProvider {
//
//    private LargerItemStackHandler inventory;
//
//    public KiloWorkBenchBE  (BlockPos pos, BlockState state) {
//        super(Registration.KILO_WORK_BENCH_BE.get(), pos, state);
//    }
//
//    public static LargerItemStackHandler createInventoryHandler(Runnable onContentsChanged) {
//        return new LargerItemStackHandler(25, onContentsChanged);
//    }
//
//    @Override
//    public Component getDisplayName() {
//        return null;
//    }
//
//
//    @Nullable
//    @Override
//    public AbstractContainerMenu createMenu(int windowId, Inventory playerInventory, Player player) {
//        return new KiloWorkBenchContainer(windowId, playerInventory,this.inventory);
//    }
//
//    private Boolean isUsableByPlayer(Player player) {
//        return true;
//    }
//
//    @Override
//    public void deserializeNBT(CompoundTag nbt) {
//        super.deserializeNBT(nbt);
//    }
//
//    @Override
//    public CompoundTag serializeNBT() {
//        return super.serializeNBT();
//    }
//
//    @Override
//    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
//        super.onDataPacket(net, pkt);
//    }
//
//    @Override
//    public void handleUpdateTag(CompoundTag tag) {
//        super.handleUpdateTag(tag);
//    }
//
//    @Override
//    public void onLoad() {
//        super.onLoad();
//    }
//
//    @Override
//    public AABB getRenderBoundingBox() {
//        return super.getRenderBoundingBox();
//    }
//
//    @Override
//    public void requestModelDataUpdate() {
//        super.requestModelDataUpdate();
//    }
//
//    @Nonnull
//    @Override
//    public IModelData getModelData() {
//        return super.getModelData();
//    }
//
//    @Nonnull
//    @Override
//    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap) {
//        return super.getCapability(cap);
//    }
//
//    public LargerItemStackHandler getInventory() {
//        return this.inventory;
//    }
//}
