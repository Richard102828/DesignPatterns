package builder.simple;

public class BuildFactory implements Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.addPorts("CUP");
    }

    @Override
    public void buildMainBoard() {
        computer.addPorts("MainBoard");
    }

    @Override
    public void buildGTX() {
        computer.addPorts("GTX");
    }

    public Computer builder() {
        return computer;
    }
}
