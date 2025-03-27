package dormarr.ghosts.util;

import dormarr.ghosts.command.MurderCommand;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class ModRegistries {

    public static void registerModRegistries(){
        registerCommands();
    }


    private static void registerCommands(){
        CommandRegistrationCallback.EVENT.register(MurderCommand::register);
    }
}
