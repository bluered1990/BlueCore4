package me.blueb8h.bluecore.commands;

import me.blueb8h.bluecore.BlueCore;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class TpaCommand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
        Player from = (Player)s;
        Player to = Bukkit.getPlayer(a[0]);
        BlueCore.tpa.request(from, to);
        return true;
    }
}
