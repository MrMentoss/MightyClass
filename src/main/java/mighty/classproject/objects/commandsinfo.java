package mighty.classproject.objects;


import java.util.List;

public class commandsinfo {

    private final String name;
    private final List<subcommandinfo> subcommands;
    private final List<subcommandinfo> compileforname;
    private final String usage;


    public commandsinfo(String name, List<subcommandinfo> compileforname, List<subcommandinfo> subcommands, String usage){
        this.name = name;
        this.compileforname = compileforname;
        this.subcommands = subcommands;
        this.usage = usage;
    }

    public String getName() {
        return name;
    }

    public List<subcommandinfo> getSubcommands() {
        return subcommands;
    }

    public List<subcommandinfo> getCompletion(){
        return compileforname;
    }

    public String getUsage() {
        return usage;
    }


}
