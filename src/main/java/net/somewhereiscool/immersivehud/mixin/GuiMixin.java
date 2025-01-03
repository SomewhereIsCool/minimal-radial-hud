package net.somewhereiscool.immersivehud.mixin;

import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.player.Player;
import net.somewhereiscool.immersivehud.hud.main.HUDManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin {
    /**
    * Doing a Mixin because I believe it would be much better to adjust the code directly than to extend
     */
    @Inject(method = "renderHealthLevel", at = @At("HEAD"), cancellable = true)
    private void renderHealthLevel(GuiGraphics p_283143_, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderHotbar", at = @At("HEAD"), cancellable = true)
    private void renderHotbar(GuiGraphics p_316628_, DeltaTracker p_348543_, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderFoodLevel", at = @At("HEAD"), cancellable = true)
    private void renderFoodLevel(GuiGraphics p_283143_, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderArmor", at = @At("HEAD"), cancellable = true)
    private static void renderArmor(GuiGraphics guiGraphics, Player player, int y, int heartRows, int height, int x, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderExperienceBar", at = @At("HEAD"), cancellable = true)
    private void renderExperienceBar(GuiGraphics guiGraphics, int x, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderExperienceLevel", at = @At("HEAD"), cancellable = true)
    private void renderExperienceLevel(GuiGraphics guiGraphics, DeltaTracker deltaTracker, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderSelectedItemName(Lnet/minecraft/client/gui/GuiGraphics;)V", at = @At("HEAD"), cancellable = true)
    private void renderSelectedItemName(GuiGraphics guiGraphics, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderSelectedItemName(Lnet/minecraft/client/gui/GuiGraphics;I)V", at = @At("HEAD"), cancellable = true)
    public void renderSelectedItemName(GuiGraphics guiGraphics, int yShift, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

    @Inject(method = "renderCrosshair", at = @At("HEAD"), cancellable = true)
    private void renderCrosshair(GuiGraphics guiGraphics, DeltaTracker deltaTracker, CallbackInfo ci) {
        if(!HUDManager.isHudEnabled()) {
            ci.cancel();
            return;
        }
    }

}
