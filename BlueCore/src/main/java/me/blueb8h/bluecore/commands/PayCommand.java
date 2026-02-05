package me.blueb8h.bluecore.commands;

import me.blueb8h.bluecore.BlueCore;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class PayCommand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
        if (!(s instanceof Player p)) return true;
        Player t = Bukkit.getPlayer(a[0]);
        double amt = Double.parseDouble(a[1]);
        BlueCore.economy.add(p.getUniqueId(), -amt);
        BlueCore.economy.add(t.getUniqueId(), amt);
        return true;
    }
}
