package dormarr.ghosts.command;

import dormarr.ghosts.DormarrsGhosts;
import dormarr.ghosts.effect.GhostEffect;
import dormarr.ghosts.util.ModRegistries;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathConstants;

public class GhostHandler {

    public static boolean toggleGhostMode(ServerPlayerEntity player){
        boolean isGhost;

        // Ghost Logic

        var ghostEffectInstance = new StatusEffectInstance(ModRegistries.GHOST, StatusEffectInstance.INFINITE, 0, false, false);

        if(player.hasStatusEffect(ModRegistries.GHOST)){
            player.removeStatusEffect(ModRegistries.GHOST);
            player.sendMessage(Text.of("§cGhost mod disabled."), false);
            isGhost = false;
        }
        else{
            player.addStatusEffect(ghostEffectInstance);
            player.sendMessage(Text.of("§aGhost mod enabled."), false);
            isGhost = true;
        }
        return isGhost;
    }
}
