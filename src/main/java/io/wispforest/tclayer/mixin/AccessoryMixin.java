package io.wispforest.tclayer.mixin;

import io.wispforest.accessories.api.AccessoriesAPI;
import io.wispforest.accessories.api.Accessory;
import io.wispforest.tclayer.TCLayer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Accessory.class)
public interface AccessoryMixin {
    @Inject(method = "canEquipFromUse(Lnet/minecraft/item/ItemStack;)Z", at = @At("HEAD"), cancellable = true)
    private void tclayer$checkIfFromTrinket(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.isIn(TCLayer.ALL_TRINKET_ITEMS) && AccessoriesAPI.isDefaultAccessory((Accessory)(Object)this)) {
            cir.setReturnValue(false);
        }
    }
}
