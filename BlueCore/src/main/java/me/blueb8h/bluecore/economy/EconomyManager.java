package me.blueb8h.bluecore.economy;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class EconomyManager {
    private final File file;
    private final FileConfiguration config;

    public EconomyManager(JavaPlugin plugin) {
        file = new File(plugin.getDataFolder(), "economy.yml");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try { file.createNewFile(); } catch (IOException ignored) {}
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    public double get(UUID uuid) {
        return config.getDouble(uuid.toString(), 0);
    }

    public void set(UUID uuid, double amount) {
        config.set(uuid.toString(), amount);
        save();
    }

    public void add(UUID uuid, double amount) {
        set(uuid, get(uuid) + amount);
    }

    private void save() {
        try { config.save(file); } catch (IOException ignored) {}
    }
}
