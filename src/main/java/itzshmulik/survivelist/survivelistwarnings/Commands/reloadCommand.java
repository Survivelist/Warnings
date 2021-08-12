package itzshmulik.survivelist.survivelistwarnings.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class reloadCommand implements CommandExecutor {

    private final JavaPlugin plugin = JavaPlugin.getProvidingPlugin(getClass());

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player player = (Player) sender;
        if(player.hasPermission("warnings.reload")){
            plugin.reloadConfig();
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aReloading plugin!"));
        }
        return false;
    }
}
