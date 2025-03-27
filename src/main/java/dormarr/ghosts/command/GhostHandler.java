package dormarr.ghosts.command;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathConstants;

public class GhostHandler {

    public static boolean toggleGhostMode(ServerPlayerEntity player){
        boolean isGhost;

        // Ghost Logic

        if(player.hasStatusEffect(StatusEffects.INVISIBILITY)){
            player.removeStatusEffect(StatusEffects.INVISIBILITY);
            player.sendMessage(Text.of("Ghost mod disabled."), false);
            isGhost = false;
        }
        else{
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, StatusEffectInstance.INFINITE, 0, false, false, false));
            player.sendMessage(Text.of("Ghost mod enabled."), false);
            isGhost = true;
        }
        return isGhost;
    }
}
