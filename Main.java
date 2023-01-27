

public class Main {

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();
        ResultView view = new ResultViewImpl();

        Menu.display();
        TerminalReader.getInstance(parser, factory, view)
                .run();
    }
}