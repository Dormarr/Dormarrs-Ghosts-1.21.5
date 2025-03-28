package dormarr.ghosts.util;

import dormarr.ghosts.DormarrsGhosts;
import dormarr.ghosts.command.MurderCommand;
import dormarr.ghosts.effect.GhostEffect;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModRegistries {

    public static void registerModRegistries(){
        registerCommands();
        registerStatusEffects();
    }


    private static void registerCommands(){
        CommandRegistrationCallback.EVENT.register(MurderCommand::register);
    }

    private static void registerStatusEffects(){

    }

    public static final RegistryEntry<StatusEffect> GHOST = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(DormarrsGhosts.MOD_ID, "ghost"), new GhostEffect());
}
