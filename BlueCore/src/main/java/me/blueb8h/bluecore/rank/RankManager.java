package me.blueb8h.bluecore.rank;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class RankManager {
    private final Map<String, String> ranks = new HashMap<>();

    public RankManager(JavaPlugin plugin) {}

    public void setRank(Player p, String rank) {
        ranks.put(p.getName(), rank);
        p.setDisplayName(color(rank) + p.getName());
        p.setPlayerListName(color(rank) + p.getName());
    }

    private ChatColor color(String rank) {
        return switch (rank.toLowerCase()) {
            case "admin" -> ChatColor.RED;
            case "mod" -> ChatColor.BLUE;
            default -> ChatColor.GRAY;
        };
    }
}
