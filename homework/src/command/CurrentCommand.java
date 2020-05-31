package command;

public class CurrentCommand implements Command {

    private Receiver receiver;

    public CurrentCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("寻找接收者");
        receiver.action();
    }
}
