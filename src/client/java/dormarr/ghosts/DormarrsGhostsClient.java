package dormarr.ghosts;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;

import java.util.HashSet;
import java.util.Set;

public class DormarrsGhostsClient implements ClientModInitializer {

	public static final Set<String> translucentPlayers = new HashSet<>();

	@Override
	public void onInitializeClient() {

	}
}