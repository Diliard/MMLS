package mod.marcymooslaggyslaggy.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.MessageType;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.TagManager;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@Mixin(ServerWorld.class)
abstract
class Clear {
    int tick = 0;

    @Shadow
    protected abstract void tickTime();

    @Shadow
    @Final
    private List<ServerPlayerEntity> players;

    @Shadow
    @NotNull
    public abstract MinecraftServer getServer();

    @Inject(at = @At("TAIL"), method = "tick")
    private void Clear(CallbackInfo info) {
        tick = (tick + 50);
        int secondsPassed = (tick / 1000);
        //1 Seconds
        if (secondsPassed == 3599) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 1 second!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //2 Seconds
        if (secondsPassed == 3598) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 2 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //3 Seconds
        if (secondsPassed == 3597) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 3 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //4 Seconds
        if (secondsPassed == 3596) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 4 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //5 Seconds
        if (secondsPassed == 3595) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 5 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //6 Seconds
        if (secondsPassed == 3594) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 6 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //7 Seconds
        if (secondsPassed == 3593) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 7 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //8 Seconds
        if (secondsPassed == 3592) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 8 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //9 Seconds
        if (secondsPassed == 3591) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 9 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }


        //10 Seconds
        if (secondsPassed == 3590) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 10 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //15 Seconds
        if (secondsPassed == 3585) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 15 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //30 Seconds
        if (secondsPassed == 3570) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 30 seconds!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //1 Minute
        if (secondsPassed == 3540) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 1 minute!"), MessageType.GAME_INFO, Util.NIL_UUID);

        }

        //5 Minutes LEFT
        if (secondsPassed == 3300) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 5 minutes!"), MessageType.GAME_INFO, Util.NIL_UUID);
        }

        //10 Minutes LEFT
        if (secondsPassed == 3000) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 10 minutes!"), MessageType.GAME_INFO, Util.NIL_UUID);
        }

        //15 Minutes LEFT
        if (secondsPassed == 2700) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 15 minutes!"), MessageType.GAME_INFO, Util.NIL_UUID);
        }

        //30 Minutes LEFT
        if (secondsPassed == 1800) {
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities will be cleared in 30 minutes!"), MessageType.GAME_INFO, Util.NIL_UUID);
        }

        //1 Hour
        if (secondsPassed == 3600) {
            tick = 0;
            secondsPassed = 0;
            EntPurge();
            PlayerManager pm = getServer().getPlayerManager();
            pm.broadcastChatMessage(new LiteralText("Entities have been cleared."), MessageType.GAME_INFO, Util.NIL_UUID);
        }
    }

    private void EntPurge() {
        ServerWorld instance = (ServerWorld) (Object) this;
        for (Entity entity : instance.getEntitiesByType(null, EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR)) {

            if (entity instanceof TameableEntity) {
                TameableEntity tameableEntity = (TameableEntity) entity;

                if (tameableEntity.isTamed() || tameableEntity.hasCustomName() || tameableEntity.hasVehicle()) {
                } else {
                    entity.kill();
                }
            }
            if (entity.hasCustomName() ||
                    entity.getType() == EntityType.ARMOR_STAND || entity.getType() == EntityType.ITEM_FRAME ||
                    entity.getType() == EntityType.CHEST_MINECART || entity.getType() == EntityType.HOPPER_MINECART ||
                    entity.getType() == EntityType.MINECART || entity.getType() == EntityType.FURNACE_MINECART ||
                    entity.getType() == EntityType.COMMAND_BLOCK_MINECART || entity.getType() == EntityType.SPAWNER_MINECART ||
                    entity.getType() == EntityType.END_CRYSTAL || entity.getType() == EntityType.PAINTING ||
                    entity.getType() == EntityType.TNT_MINECART || entity.getType() == EntityType.ELDER_GUARDIAN ||
                    entity.getType() == EntityType.ENDER_DRAGON || entity.getType() == EntityType.WITHER || entity.getType() == EntityType.SHULKER ||
                    entity.getType() == EntityType.VILLAGER || entity.hasVehicle() || entity.getType() == EntityType.BOAT || entity.getType() == EntityType.LEASH_KNOT ||
                    entity instanceof PlayerEntity || entity instanceof TameableEntity) {

            } else {
                entity.kill();
            }

        } EntPurge2();
    }
    private void EntPurge2() {
        ServerWorld instance = (ServerWorld) (Object) this;
        for (Entity entity : instance.getEntitiesByType(EntityType.ITEM, EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR)) {
            if (entity.getType() == EntityType.ITEM) {
                entity.kill();
            }
        }
    }
}

