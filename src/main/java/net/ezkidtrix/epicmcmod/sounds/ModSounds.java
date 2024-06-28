package net.ezkidtrix.epicmcmod.sounds;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent GOLEM_MUSIC = registerSoundEvent("golem_music");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(GolemMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        GolemMod.LOGGER.info("Registering sounds for " + GolemMod.MOD_ID);
    }
}
