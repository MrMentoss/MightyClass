package mighty.classproject;

import mighty.classproject.commands.commands;
import mighty.classproject.objects.commandsinfo;
import me.mattstudios.mf.base.CommandManager;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;
import java.util.List;


public class main extends JavaPlugin {
    public TextComponent TextComponent;

    public static List<commandsinfo> commandarray = new ArrayList<>(); // new array creation

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE + "[MightyClass] Plugin has" + ChatColor.GOLD + " enabled"); // print text in console that plugin is enabled when server starts
        CommandManager commandManager = new CommandManager(this);
        commandManager.register(new commands());
    }

    @Override
    public void onDisable () {
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE + "[MightyClass] Plugin has" + ChatColor.GOLD + " disabled"); // print text in console that plugin is disabled when server starts
        }

    public static void getHelp(Player player) { // public void for print help to player with command /mightyclass help
        player.sendMessage(color("&8&l&m-------------------------"));
        commandarray.forEach((command) -> {
            command.getSubcommands().forEach((subcommand) -> {
                    TextComponent message = new TextComponent(color("&6/" + command.getName() + " &7" + subcommand.getName() + " " +subcommand.getCompileforname() + " &8- &7" + subcommand.getDescription()));
                    message.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/" + command.getName() + " " + subcommand.getName()));
                    message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(color("&6/" + command.getName() +  " &7" + subcommand.getName())).create()));
                    player.spigot().sendMessage(message);
            });
        });
        player.sendMessage(color("&8&l&m-------------------------"));
    }

    public static String color(String string) {
        return net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', string);
    }



}





