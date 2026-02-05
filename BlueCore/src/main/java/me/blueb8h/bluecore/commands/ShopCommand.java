package me.blueb8h.bluecore.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShopCommand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
        Player p = (Player)s;
        Inventory inv = Bukkit.createInventory(null, 9, "Shop");
        inv.addItem(new ItemStack(Material.DIAMOND, 1));
        p.openInventory(inv);
        return true;
    }
}
