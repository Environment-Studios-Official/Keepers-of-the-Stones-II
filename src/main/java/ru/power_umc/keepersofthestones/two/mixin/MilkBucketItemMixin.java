package ru.power_umc.keepersofthestones.two.mixin;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.power_umc.keepersofthestones.two.PowerMod;
import ru.power_umc.keepersofthestones.two.network.PowerModVariables;
@Mixin(MilkBucketItem.class) public class MilkBucketItemMixin {
    @Inject(method = "finishUsingItem", at = @At("HEAD"), cancellable = true)
    public void mix$finishUsingItem(ItemStack p_42923_,
        Level p_42924_,
        LivingEntity p_42925_,
        CallbackInfoReturnable < ItemStack > cir) {
        cir.cancel();
        if ((p_42925_
                .getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new PowerModVariables.PlayerVariables()))
            .active == false) {
            if (!p_42924_.isClientSide)
                p_42925_.curePotionEffects(p_42923_); {}
        }
        if (p_42925_ instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, p_42923_);
            serverplayer.awardStat(Stats.ITEM_USED.get((MilkBucketItem)(Object) this));
        }
        if (p_42925_ instanceof Player &&
            !((Player) p_42925_).getAbilities().instabuild) {
            p_42923_.shrink(1);
        }
        cir.setReturnValue(p_42923_.isEmpty() ? new ItemStack(Items.BUCKET) :
            p_42923_);
    }
}