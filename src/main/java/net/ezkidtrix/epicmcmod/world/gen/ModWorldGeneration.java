package net.ezkidtrix.epicmcmod.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();
        ModEntityGeneration.addSpawns();
    }
}
