//package com.epitap.blocks;
//
//import com.epitap.degeneracycraft.DegeneracyCraft;
//import com.mojang.blaze3d.systems.RenderSystem;
//import com.mojang.blaze3d.vertex.PoseStack;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.entity.player.Inventory;
//
//
//public class KiloWorkBenchScreen extends AbstractContainerScreen<KiloWorkBenchContainer> {
//
//    private ResourceLocation GUI = new ResourceLocation(DegeneracyCraft.MODID,
//            "textures/gui/advanced_table.png");
//
//    public KiloWorkBenchScreen(KiloWorkBenchContainer container, Inventory inv, Component name) {
//        super(container, inv, name);
//    }
//
//    @Override
//    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
//        this.renderBackground(matrixStack);
//        super.render(matrixStack, mouseX, mouseY, partialTicks);
//        this.renderTooltip(matrixStack, mouseX, mouseY);
//    }
//
//    @Override
//    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
//    }
//
//    @Override
//    protected void renderBg(PoseStack matrixStack, float partialTicks, int mouseX, int mouseY) {
//        RenderSystem.setShaderTexture(0, GUI);
//        int relX = (this.width - this.imageWidth) / 2;
//        int relY = (this.height - this.imageHeight) / 2;
//        this.blit(matrixStack, relX, relY, 0, 0, this.imageWidth, this.imageHeight);
//    }
//}
