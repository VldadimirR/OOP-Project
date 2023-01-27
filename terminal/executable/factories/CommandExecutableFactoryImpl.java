package terminal.executable.factories;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    protected final StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable create(Command command) {

        if (command.isAddCommand()) {
            return new CreateStudentExecutable(studentService, command);
        }

        if (command.isDeleteCommandByFio()) {
            return new DeleteStudentByFioExecutable(studentService, command);
        }

        if (command.isDeleteCommandByNumberAge()) {
            return new DeleteStudentByAgeAndGroupNumberExecutable(studentService, command);
        }

        return new NoneCommandExecutable();
    }
}