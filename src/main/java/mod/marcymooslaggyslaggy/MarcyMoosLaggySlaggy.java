package mod.marcymooslaggyslaggy;

/*

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

import java.util.Timer;
import java.util.TimerTask;

public class MarcyMoosLaggySlaggy {
    Timer timer;

    public MarcyMoosLaggySlaggy(int seconds) {
        timer = new Timer();
        timer.schedule(new TimedPt(), seconds * 1000);
        System.out.println("Timerthread Setup");
    }

    private class TimedPt extends TimerTask {
        public void run() {
            System.out.format("Timer Task Finished..!%n");
            EntPurge();
        }
    }

     private boolean EntPurge() {
         ServerWorld instance = (ServerWorld) (Object) this;
        for (Entity entity : instance.getEntitiesByType(null, EntityPredicates.VALID_ENTITY)) {
            if (entity instanceof TameableEntity) {
                TameableEntity tameableEntity = (TameableEntity) entity;

                if (tameableEntity.isTamed() || entity.hasCustomName() ||
                        entity.getType() == EntityType.ARMOR_STAND || entity.getType() == EntityType.ITEM_FRAME ||
                        entity.getType() == EntityType.CHEST_MINECART || entity.getType() == EntityType.HOPPER_MINECART ||
                        entity.getType() == EntityType.MINECART || entity.getType() == EntityType.FURNACE_MINECART ||
                        entity.getType() == EntityType.COMMAND_BLOCK_MINECART || entity.getType() == EntityType.SPAWNER_MINECART ||
                        entity.getType() == EntityType.END_CRYSTAL || entity.getType() == EntityType.PAINTING ||
                        entity.getType() == EntityType.TNT_MINECART || entity.getType() == EntityType.ELDER_GUARDIAN ||
                        entity.getType() == EntityType.ENDER_DRAGON || entity.getType() == EntityType.WITHER || entity.getType() == EntityType.SHULKER ||
                        entity.getType() == EntityType.VILLAGER || ((TameableEntity) entity).isInSittingPose() || entity.getType() == EntityType.BOAT ||
                        ((TameableEntity) entity).isLeashed() || entity instanceof PlayerEntity)
                {
                    return false;
                } else {
                    entity.kill();
                    return true;
                }
            }
        }
        return false;
    }

}

 */