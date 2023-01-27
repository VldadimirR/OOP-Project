package terminal.parser;

public class CommandParserImpl implements CommandParser {

    public Command parseCommand(String inputCommand) {
        List<String> list = asList(inputCommand.split("\\s+"));
        return new Command(list);
    }
}