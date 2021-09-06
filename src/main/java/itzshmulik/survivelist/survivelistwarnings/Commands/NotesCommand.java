package itzshmulik.survivelist.survivelistwarnings.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class NotesCommand implements CommandExecutor {

    private final JavaPlugin plugin = JavaPlugin.getProvidingPlugin(getClass());
    private final String NoPermMsg = plugin.getConfig().getString("No-perm-message");

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player player = (Player) sender;
        if(player.hasPermission("warnings.notes") || player.hasPermission("warnings.staff")){
            if(args.length > 0){
                if(args[0].equalsIgnoreCase("view")){

                }
                if(args[0].equalsIgnoreCase("manage")){

                }
                if(args[0].equalsIgnoreCase("archive")){

                }if(args[0].equalsIgnoreCase("delete")){

                }
            }
        }else{
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', NoPermMsg));
        }
        return false;
    }
}
