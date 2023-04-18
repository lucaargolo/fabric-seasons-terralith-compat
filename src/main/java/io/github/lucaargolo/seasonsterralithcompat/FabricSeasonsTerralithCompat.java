package io.github.lucaargolo.seasonsterralithcompat;

import io.github.lucaargolo.seasons.FabricSeasons;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.Version;

public class FabricSeasonsTerralithCompat implements ModInitializer {

    private static final String MOD_ID = "seasonsterralithcompat";
    private static final String DEP_ID = "terralith";

    @Override
    public void onInitialize() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
            Version version = modContainer.getMetadata().getVersion();
            String[] split = version.getFriendlyString().split("-");
            if(split.length > 1) {
                String mod = split[0];
                String dep = split[1];
                FabricSeasons.LOGGER.info("[" + FabricSeasons.MOD_NAME + "] Successfully loaded "+MOD_ID+" "+mod+" for "+DEP_ID+" "+dep);
            }
        });

    }


}
