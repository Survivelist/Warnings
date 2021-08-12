package itzshmulik.survivelist.survivelistwarnings.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class warnCommand implements CommandExecutor {

    private final JavaPlugin plugin = JavaPlugin.getProvidingPlugin(getClass());

    String offlinePlayerMsg = plugin.getConfig().getString("Offline-target-message");

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {


        // Enables the /warn command, works only if the target is online.
        Player player = (Player) sender;
        if(player.hasPermission("warnings.warn")) {
            if (args.length > 0) {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {

                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', offlinePlayerMsg));
                }
            }
        }
        return false;
    }
}
