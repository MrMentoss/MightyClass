package mighty.classproject.commands;

import me.mattstudios.mf.annotations.*;
import mighty.classproject.objects.commandsinfo;
import mighty.classproject.objects.subcommandinfo;
import mighty.classproject.main;
import me.mattstudios.mf.base.CommandBase;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.List;


@Command("mightyclass")
public class commands extends CommandBase {

    public commands() {
        main.commandarray.add(new commandsinfo(
                            "mightyclass",
                    List.of(
                                    new subcommandinfo ("help","","Get command help"),
                                    new subcommandinfo("create","&7[name&7]","create your class")
                        ),
                    List.of(
                                    new subcommandinfo("help","","Get command help"),
                                    new subcommandinfo("create","&7[name&7]","create your class")

                    ),

            "/mightyclass [subcommand] [Completion]"
                )
        );
     }

        @Default
        public void execute(Player player) {
            main.getHelp(player);
        }

        @SubCommand("help") // subcommand to execute help list for plugin
        public void help(Player player) {
        main.getHelp(player);
        }

        @SubCommand("create") //subcommand for creating a class
        @WrongUsage("&6/mightyclass create &7[text&7]")
        public void create(final CommandSender sender, final String value) {
        sender.sendMessage(value);
        }




}





