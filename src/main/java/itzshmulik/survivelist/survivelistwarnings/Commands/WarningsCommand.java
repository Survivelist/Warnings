/*
 * MIT License
 *
 * Copyright (c) 2021 shmulik55 <https://github.com/shmulik55>
 * Copyright (c) 2021 Matt (ms5984) <https://github.com/ms5984>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package itzshmulik.survivelist.survivelistwarnings.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

/**
 * Implements the plugin management (reload, etc) command.
 *
 * @since 1.0.0
 */
public class WarningsCommand implements CommandExecutor {

    private final JavaPlugin plugin = JavaPlugin.getProvidingPlugin(getClass());

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length > 0) {
            final String firstArg = args[0].toLowerCase(Locale.ROOT);
            if (firstArg.equals("reload")) {
                if (!sender.hasPermission("warnings.reload")) {
                    // TODO: send no permission message
                    return true;
                }
                plugin.reloadConfig();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aReloading plugin!"));
                return true;
            }
        }
        // send usage
        return false;
    }
}
