package me.blueb8h.bluecore.commands;

import me.blueb8h.bluecore.BlueCore;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class EcoCommand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
        Player p = Bukkit.getPlayer(a[1]);
        double amt = Double.parseDouble(a[2]);
        if (a[0].equals("give")) BlueCore.economy.add(p.getUniqueId(), amt);
        if (a[0].equals("set")) BlueCore.economy.set(p.getUniqueId(), amt);
        return true;
    }
}
