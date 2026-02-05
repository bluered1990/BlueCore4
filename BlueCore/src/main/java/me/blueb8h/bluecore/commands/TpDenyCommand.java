package me.blueb8h.bluecore.commands;

import me.blueb8h.bluecore.BlueCore;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class TpDenyCommand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
        BlueCore.tpa.deny((Player)s);
        return true;
    }
}
