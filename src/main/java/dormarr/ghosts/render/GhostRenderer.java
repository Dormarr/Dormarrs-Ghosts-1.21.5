package dormarr.ghosts.render;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class GhostRenderer{

    // Look at invisibility and see how that renders.
    public static void ToggleVisibility(LivingEntity livingEntity, boolean isGhost){

        livingEntity.setInvisible(isGhost);


        // Implement translucency code.
    }
}
