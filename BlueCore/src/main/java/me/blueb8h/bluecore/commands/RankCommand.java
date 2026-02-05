package me.blueb8h.bluecore.commands;

import me.blueb8h.bluecore.BlueCore;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class RankCommand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
        Player p = Bukkit.getPlayer(a[0]);
        BlueCore.ranks.setRank(p, a[1]);
        return true;
    }
}
