package mod.marcymooslaggyslaggy;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
@Environment(EnvType.SERVER)
public class Main implements ModInitializer {

    @Override
    public void onInitialize() {
        System.out.println("Setting quite literially nothing up");
    }
}