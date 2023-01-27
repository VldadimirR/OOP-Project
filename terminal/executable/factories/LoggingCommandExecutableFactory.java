package terminal.executable.factories;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command command) {
        System.out.println(command);
        CommandExecutable result = super.create(command);
        System.out.println("Bye");
        return result;
    }
}
