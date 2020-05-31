package command;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoker() {
        System.out.println("下达命令");
        command.execute();
    }
}
