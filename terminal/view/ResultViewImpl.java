package terminal.view;

public class ResultViewImpl implements ResultView {

    @Override
    public void processCommandResult(CommandResult commandResult) {
        System.out.println(commandResult);
    }

}
