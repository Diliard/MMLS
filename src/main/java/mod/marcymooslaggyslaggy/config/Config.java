package mod.marcymooslaggyslaggy.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.entity.EntityType;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Config {
    private static final String CONFIG_PATH = "config/MMLS.json";
    private static final Config DEFAULT = new Config(true);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static ArrayList<Object> WhitelistedEntities;
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

    private static ArrayList<Object> createDefaultEntityList() {
        ArrayList<Object> entities = new ArrayList<>();
        entities.add(EntityType.ITEM_FRAME);
        entities.add(EntityType.CHEST_MINECART);
        entities.add(EntityType.HOPPER_MINECART);
        entities.add(EntityType.MINECART);
        entities.add(EntityType.FURNACE_MINECART);
        entities.add(EntityType.COMMAND_BLOCK_MINECART);
        entities.add(EntityType.SPAWNER_MINECART);
        entities.add(EntityType.END_CRYSTAL);
        entities.add(EntityType.PAINTING);
        entities.add(EntityType.TNT_MINECART);
        entities.add(EntityType.ELDER_GUARDIAN);
        entities.add(EntityType.ENDER_DRAGON);
        entities.add(EntityType.WITHER);
        entities.add(EntityType.SHULKER);
        entities.add(EntityType.VILLAGER);
        entities.add(EntityType.BOAT);
        entities.add(EntityType.LEASH_KNOT);
        entities.add(EntityType.BEE);
        entities.add(EntityType.HORSE);
        entities.add(EntityType.SKELETON_HORSE);
        entities.add(EntityType.DONKEY);
        entities.add(EntityType.EVOKER);
        entities.add(EntityType.ITEM);
        entities.add(EntityType.AREA_EFFECT_CLOUD);
        entities.add(EntityType.ENDER_PEARL);
        entities.add(EntityType.ARROW);
        entities.add(EntityType.CAT);
        entities.add(EntityType.ENDER_DRAGON);
        entities.add(EntityType.END_CRYSTAL);
        entities.add(EntityType.FOX);
        entities.add(EntityType.WOLF);
        entities.add(EntityType.TRIDENT);
        entities.add(EntityType.ARMOR_STAND);
        return entities;
    }
}