package net.ezkidtrix.epicmcmod.registry;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public interface ModdedJukeboxSongs extends JukeboxSongs {
    RegistryKey<JukeboxSong> GOLEM_SONG = of("golem_music");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(GolemMod.MOD_ID, id));
    }
}
