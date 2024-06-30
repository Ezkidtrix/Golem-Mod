package net.ezkidtrix.epicmcmod.sound;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent GOLEM_SONG = registerSoundEvent("golem_music");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(GolemMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {
        GolemMod.LOGGER.info("Regstering sounds for " + GolemMod.MOD_ID);
    }
}
