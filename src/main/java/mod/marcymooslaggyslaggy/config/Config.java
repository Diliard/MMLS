package mod.marcymooslaggyslaggy.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Config {
    private static final String CONFIG_PATH = "config/MMLS.json";
    private static final Config DEFAULT = new Config(true);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static ArrayList WhitelistedEntities;
    public Config() {
    }

    private Config(boolean useDefault) {
        if (useDefault) {
            WhitelistedEntities = createDefaultEntityList();
        }
    }

    public short configVersion = 1;

    public void save() {
        save(this);
    }

    public static Config load() {
        File file = new File(CONFIG_PATH);
        if (!file.exists()) save(DEFAULT);

        try (FileReader fr = new FileReader(CONFIG_PATH)) {
            Config config = GSON.fromJson(fr, Config.class);
            if (config.configVersion != DEFAULT.configVersion) {
                file.delete();
                save(config);
                return load();
            }
            return config;
        } catch (IOException e) {
            e.printStackTrace();
            return DEFAULT;
        }
    }

    private static void save(Config config) {
        try {
            File file = new File(CONFIG_PATH);
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(CONFIG_PATH)) {
            fw.write(GSON.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList createDefaultEntityList() {
        ArrayList entities = new ArrayList<>();
        entities.add("ITEM_FRAME");
        entities.add("CHEST_MINECART");
        entities.add("HOPPER_MINECART");
        entities.add("MINECART");
        entities.add("FURNACE_MINECART");
        entities.add("COMMAND_BLOCK_MINECART");
        entities.add("SPAWNER_MINECART");
        entities.add("END_CRYSTAL");
        entities.add("PAINTING");
        entities.add("TNT_MINECART");
        entities.add("ELDER_GUARDIAN");
        entities.add("ENDER_DRAGON");
        entities.add("WITHER");
        entities.add("SHULKER");
        entities.add("VILLAGER");
        entities.add("BOAT");
        entities.add("LEASH_KNOT");
        entities.add("BEE");
        entities.add("HORSE");
        entities.add("SKELETON_HORSE");
        entities.add("DONKEY");
        entities.add("EVOKER");
        entities.add("ITEM");
        entities.add("AREA_EFFECT_CLOUD");
        entities.add("ARROW");
        entities.add("CAT");
        entities.add("ENDER_DRAGON");
        entities.add("END_CRYSTAL");
        entities.add("FOX");
        entities.add("WOLF");
        entities.add("TRIDENT");
        return entities;
    }
}