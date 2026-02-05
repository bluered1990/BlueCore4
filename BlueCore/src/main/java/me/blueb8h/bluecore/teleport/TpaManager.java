package me.blueb8h.bluecore.teleport;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class TpaManager {
    private final Map<Player, Player> requests = new HashMap<>();

    public void request(Player from, Player to) {
        requests.put(to, from);
    }

    public Player accept(Player to) {
        return requests.remove(to);
    }

    public void deny(Player to) {
        requests.remove(to);
    }
}
