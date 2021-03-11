package mod.marcymooslaggyslaggy.config;
/*

 UNUSED: https://www.digminecraft.com/lists/entity_list_pc.php IF COMPLETED
public class MMLSConfig {
    @Config(category = "Entities", key = "Lingering bottles", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean area_effect_cloud = false;

    @Config(category = "Entities", key = "Armor Stand's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean armor_stand = false;

    @Config(category = "Entities", key = "Arrow's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean arrow = false;

    @Config(category = "Entities", key = "Bat's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean Bat = true;

    @Config(category = "Entities", key = "Bee's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean bee = false;

    @Config(category = "Entities", key = "Blazes", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean blaze = true;

    @Config(category = "Entities", key = "Boat's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean boat = true;

    @Config(category = "Entities", key = "Cat's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean cat = false;

    @Config(category = "Entities", key = "Cave Spider's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean cave_spider = true;

    @Config(category = "Entities", key = "Minecart's with chests", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean chest_minecraft = false;

    @Config(category = "Entities", key = "Chicken's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean chicken = true;

    @Config(category = "Entities", key = "Cod's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean cod = true;

    @Config(category = "Entities", key = "Command block minecart's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean command_block_minecart = false;

    @Config(category = "Entities", key = "Cow's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean cow = true;

    @Config(category = "Entities", key = "Creeper's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean creeper = true;

    @Config(category = "Entities", key = "dolphin's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean dolphin = true;

    @Config(category = "Entities", key = "donkey's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean donkey = true;

    @Config(category = "Entities", key = "dragon fireball", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean dragon_fireball = false;

    @Config(category = "Entities", key = "Drowned", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean drowned = true;

    @Config(category = "Entities", key = "egg's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean egg = false;

    @Config(category = "Entities", key = "Elder guardian", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean elder_guardian = false;

    @Config(category = "Entities", key = "End crystals", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean end_crystal = false;

    @Config(category = "Entities", key = "the Ender dragon", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean ender_dragon = false;

    @Config(category = "Entities", key = "Ender pearls", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean ender_pearl = false;

    @Config(category = "Entities", key = "Enderman", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean enderman = true;

    @Config(category = "Entities", key = "Endermites", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean endermite = true;

    @Config(category = "Entities", key = "Evoker's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean evoker = false;

    @Config(category = "Entities", key = "the Evoker fangs", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean evoker_fangs = false;

    @Config(category = "Entities", key = "Exp bottles", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean experience_bottle = false;

    @Config(category = "Entities", key = "Experience orbs", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean experience_orb = false;

    @Config(category = "Entities", key = "Eye of ender's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean eye_of_ender = false;

    @Config(category = "Entities", key = "Falling blocks", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean falling_block = true;

    @Config(category = "Entities", key = "fireball's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean fireball = false;

    @Config(category = "Entities", key = "Firework rockets", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean firework_rocket = false;

    @Config(category = "Entities", key = "fox", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean fox = true;

    @Config(category = "Entities", key = "ghast's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean ghast = false;

    @Config(category = "Entities", key = "giant's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean giant = false;

    @Config(category = "Entities", key = "guardian", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean guardian = false;

    @Config(category = "Entities", key = "hoglins", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean hoglin = false;

    @Config(category = "Entities", key = "Minecart's with hoppers", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean hopper_minecart = false;

    @Config(category = "Entities", key = "horses", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean horse = false;

    @Config(category = "Entities", key = "husk", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean husk = false;

    @Config(category = "Entities", key = "Iron golem's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean iron_golem = false;

    @Config(category = "Entities", key = "Dropped items", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean item = false;

    @Config(category = "Entities", key = "item frames", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean item_frame = false;

    @Config(category = "Entities", key = "leash knot", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean leash_knot = false;

    @Config(category = "Entities", key = "Lightning bolt's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean lightning_bolt = false;

    @Config(category = "Entities", key = "llama's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean llama = false;

    @Config(category = "Entities", key = "llama_spit", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean llama_spit = false;

    @Config(category = "Entities", key = "Magma cubes", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean magma_cube = false;

    @Config(category = "Entities", key = "Minecart's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean minecart = false;

    @Config(category = "Entities", key = "Mooshrooms", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean mooshroom = false;

    @Config(category = "Entities", key = "mule's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean mule = false;

    @Config(category = "Entities", key = "Ocelot's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean ocelot = false;

    @Config(category = "Entities", key = "Paintings", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean painting = false;

    @Config(category = "Entities", key = "Panda's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean panda = false;

    @Config(category = "Entities", key = "parrot's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean parrot = false;

    @Config(category = "Entities", key = "phantom's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean phantom = false;

    @Config(category = "Entities", key = "Pig's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean pig = false;

    @Config(category = "Entities", key = "Piglins", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean piglin = false;

    @Config(category = "Entities", key = "Piglin brutes", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean piglin_brute = false;

    @Config(category = "Entities", key = "Pillagers", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean pillager = false;

    @Config(category = "Entities", key = "Polar bear's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean polar_bear = false;

    @Config(category = "Entities", key = "thrown potion's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean potion = false;

    @Config(category = "Entities", key = "pufferfish", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean pufferfish = false;

    @Config(category = "Entities", key = "rabbit's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean rabbit = false;

    @Config(category = "Entities", key = "Ravager's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean ravager = false;

    @Config(category = "Entities", key = "salmon's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean salmon = false;

    @Config(category = "Entities", key = "sheep's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean sheep = false;

    @Config(category = "Entities", key = "shulkers", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean shulker = false;

    @Config(category = "Entities", key = "shulker_bullets", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean shulker_bullet = false;

    @Config(category = "Entities", key = "silverfishes", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean silverfish = false;

    @Config(category = "Entities", key = "skeleton's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean skeleton = false;

    @Config(category = "Entities", key = "skeleton horses", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean skeleton_horse = false;

    @Config(category = "Entities", key = "slime's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean slime = false;

    @Config(category = "Entities", key = "small_fireball", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean small_fireball = false;

    @Config(category = "Entities", key = "snow golem's", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean snow_golem = false;

    @Config(category = "Entities", key = "snowball", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean snowball = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;

    @Config(category = "Entities", key = "Minecart's with furnaces", comment = "If the entity should be cleared. true for yes false for no")
    public static boolean furnace_minecart = false;














}

*/