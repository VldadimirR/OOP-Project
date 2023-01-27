package terminal;

public class Command {
    public static final String ADD = "add";
    public static final String DEL = "del";
    public static final String DEL_FIO = "def";
    public static final String DEL_NUMB_AGE = "dna";
    private final List<String> arguments;
    private final String mainCommand;

    public Command(List<String> commands) {
        this.mainCommand = commands.get(0);
        this.arguments = new ArrayList<>(commands);

    }

    public List<String> getAttributes() {
        return arguments;
    }

    public String getMainCommand() {
        return mainCommand;
    }

    public boolean isAddCommand() {
        return mainCommand.equals(ADD);
    }

    public boolean isDeleteCommandByFio() {
        return mainCommand.equals(DEL) &&
                !arguments.isEmpty() &&
                arguments.get(0).equals(DEL_FIO);
    }

    public boolean isDeleteCommandByNumberAge() {
        return mainCommand.equals(DEL) &&
                !arguments.isEmpty() &&
                arguments.get(0).equals(DEL_NUMB_AGE);
    }

    @Override
    public String toString() {
        return "Command{" +
                "mainCommand='" + mainCommand + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}

