package me.blueb8h.bluecore;

import me.blueb8h.bluecore.commands.*;
import me.blueb8h.bluecore.economy.EconomyManager;
import me.blueb8h.bluecore.rank.RankManager;
import me.blueb8h.bluecore.teleport.TpaManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueCore extends JavaPlugin {

    public static EconomyManager economy;
    public static RankManager ranks;
    public static TpaManager tpa;

    @Override
    public void onEnable() {
        economy = new EconomyManager(this);
        ranks = new RankManager(this);
        tpa = new TpaManager();

        getCommand("bal").setExecutor(new BalanceCommand());
        getCommand("pay").setExecutor(new PayCommand());
        getCommand("eco").setExecutor(new EcoCommand());
        getCommand("rank").setExecutor(new RankCommand());
        getCommand("tpa").setExecutor(new TpaCommand());
        getCommand("tpaccept").setExecutor(new TpAcceptCommand());
        getCommand("tpdeny").setExecutor(new TpDenyCommand());
        getCommand("shop").setExecutor(new ShopCommand());

        getLogger().info("BlueCore enabled");
    }
}
