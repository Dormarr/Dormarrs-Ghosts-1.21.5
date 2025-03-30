package dormarr.ghosts.effect;

import dormarr.ghosts.command.GhostHandler;
import dormarr.ghosts.render.GhostRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class GhostEffect extends StatusEffect {

    public GhostEffect(){
        super(StatusEffectCategory.NEUTRAL, 0xe9b8b3);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier){
        return true;
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier){
        if(entity instanceof PlayerEntity){
            // Do effect stuff.
            GhostRenderer.ToggleVisibility(entity, GhostHandler.isGhost);
        }

        return super.applyUpdateEffect(world, entity, amplifier);
    }
}
