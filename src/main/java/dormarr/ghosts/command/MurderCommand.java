package dormarr.ghosts.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.entity.Entity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import java.util.Collection;
import java.util.Iterator;

public class MurderCommand {

    public MurderCommand(){}

    public static void register(CommandDispatcher<ServerCommandSource> serverCommandSourceCommandDispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {

        serverCommandSourceCommandDispatcher.register(CommandManager.literal("murder")
                .requires(source -> source.hasPermissionLevel(2))
                .then(CommandManager.argument("targets", EntityArgumentType.entities())
                        .executes(context -> {
                            ServerPlayerEntity player = context.getSource().getPlayer();
                            if(player != null){
                                boolean isGhost = GhostHandler.toggleGhostMode(player);
                                //Ghost networking.
                            }
                            return 1;
                        })
                )
        );
    }

    private static int execute(ServerCommandSource source, Collection<? extends Entity> targets){
        Iterator var2 = targets.iterator();

        while(var2.hasNext()){
            Entity entity = (Entity) var2.next();
        }

        if (targets.size() == 1) {

            source.sendFeedback(() -> {
                return Text.literal("Nice.");
            }, true);
        }

        return targets.size();
    }


}


