package mod.marcymooslaggyslaggy;

import mod.marcymooslaggyslaggy.config.Config;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.minecraft.server.MinecraftServer;

@Environment(EnvType.SERVER)
public class Main implements ModInitializer {
    public static final Config CONFIG = Config.load();

    @Override
    public void onInitialize() {
        System.out.println("Setting quite literially nothing up");
        System.out.println(Config.WhitelistedEntities);
    }

    @Environment(EnvType.SERVER)
    private void onServerStart(MinecraftServer minecraftServer) {

    }
}