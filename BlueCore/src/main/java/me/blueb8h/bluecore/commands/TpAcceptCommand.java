package me.blueb8h.bluecore.commands;

import me.blueb8h.bluecore.BlueCore;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class TpAcceptCommand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
        Player to = (Player)s;
        Player from = BlueCore.tpa.accept(to);
        from.teleport(to.getLocation());
        return true;
    }
}
