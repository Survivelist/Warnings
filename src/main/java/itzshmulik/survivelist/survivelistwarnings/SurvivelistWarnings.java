package itzshmulik.survivelist.survivelistwarnings;

import itzshmulik.survivelist.survivelistwarnings.Commands.reloadCommand;
import itzshmulik.survivelist.survivelistwarnings.Commands.warnCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivelistWarnings extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("warn").setExecutor(new warnCommand());
        getCommand("wreload").setExecutor(new reloadCommand());

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
