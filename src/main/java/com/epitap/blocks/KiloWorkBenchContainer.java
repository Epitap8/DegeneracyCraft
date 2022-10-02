//package com.epitap.blocks;
//
//import com.epitap.inventory.LargerCraftingInventory;
//import com.epitap.inventory.LargerItemStackHandler;
//import com.epitap.slot.TableOutputSlot;
//import net.minecraft.world.Container;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.inventory.MenuType;
//import net.minecraft.world.inventory.ResultContainer;
//import net.minecraft.world.inventory.Slot;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//
//import java.util.function.Function;
//public class KiloWorkBenchContainer extends AbstractContainerMenu {
//
//    private static final MenuType<?> type = null;
//    private Function<Player, Boolean> isUsableByPlayer;
//    private final Level world;
//    private final Container result;
//
//    public KiloWorkBenchContainer(int id, Inventory playerInventory, LargerItemStackHandler inventory) {
//        super(type, id);
//        this.isUsableByPlayer = isUsableByPlayer;
//        this.world = playerInventory.player.level;
//        this.result = new ResultContainer();
//
//        var matrix = new LargerCraftingInventory(this, inventory, 5);
//
//        this.addSlot(new TableOutputSlot(this, matrix, this.result, 0, 142, 53));
//
//        int i, j;
//        for (i = 0; i < 5; i++) {
//            for (j = 0; j < 5; j++) {
//                this.addSlot(new Slot(matrix, j + i * 5, 14 + j * 18, 18 + i * 18));
//            }
//        }
//
//        for (i = 0; i < 3; i++) {
//            for (j = 0; j < 9; j++) {
//                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 124 + i * 18));
//            }
//        }
//
//        for (j = 0; j < 9; j++) {
//            this.addSlot(new Slot(playerInventory, j, 8 + j * 18, 182));
//        }
//
//        this.slotsChanged(matrix);
//    }
//
//
//    @Override
//    public void slotsChanged(Container matrix) {
//
//        super.slotsChanged(matrix);
//    }
//
//    @Override
//    public boolean stillValid(Player player) {
//        return this.isUsableByPlayer.apply(player);
//    }
//
//    @Override
//    public ItemStack quickMoveStack(Player player, int slotNumber) {
//        var itemstack = ItemStack.EMPTY;
//        var slot = this.slots.get(slotNumber);
//
//        if (slot.hasItem()) {
//            var itemstack1 = slot.getItem();
//            itemstack = itemstack1.copy();
//
//            if (slotNumber == 0) {
//                if (!this.moveItemStackTo(itemstack1, 26, 62, true)) {
//                    return ItemStack.EMPTY;
//                }
//
//                slot.onQuickCraft(itemstack1, itemstack);
//            } else if (slotNumber >= 26 && slotNumber < 62) {
//                if (!this.moveItemStackTo(itemstack1, 1, 26, false)) {
//                    return ItemStack.EMPTY;
//                }
//            } else if (!this.moveItemStackTo(itemstack1, 26, 62, false)) {
//                return ItemStack.EMPTY;
//            }
//
//            if (itemstack1.isEmpty()) {
//                slot.set(ItemStack.EMPTY);
//            } else {
//                slot.setChanged();
//            }
//
//            if (itemstack1.getCount() == itemstack.getCount()) {
//                return ItemStack.EMPTY;
//            }
//
//            slot.onTake(player, itemstack1);
//        }
//
//        return itemstack;
//
//    }
//}