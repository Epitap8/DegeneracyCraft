package com.epitap.items;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class Astema extends Item {
    public Astema(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(stack, level, list, flags);
        int charge = stack.hasTag() ? stack.getTag().getInt("charge"):0;
        list.add(new TranslatableComponent("message.astema").withStyle(ChatFormatting.WHITE,ChatFormatting.UNDERLINE));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        int charge = stack.getOrCreateTag().getInt("charge");
        charge++;
        stack.getTag().putInt("charge", charge);
        if (level.isClientSide()){
            player.sendMessage(new TranslatableComponent("message.astema.charge",Integer.toString(charge)), Util.NIL_UUID);
        }
        return InteractionResultHolder
                .success(stack);
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return super.isDamageable(stack);
    }
}