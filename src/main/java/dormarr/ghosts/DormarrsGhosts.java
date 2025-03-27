package dormarr.ghosts;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dormarr.ghosts.command.MurderCommand;
import dormarr.ghosts.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager.*;

public class DormarrsGhosts implements ModInitializer {
	public static final String MOD_ID = "dormarrs-ghosts";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModRegistries.registerModRegistries();
	}
}