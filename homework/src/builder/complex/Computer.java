package builder.complex;

public class Computer {
    private String cpu;
    private String mainBoard;
    private String gtx;

    public Computer(String cpu, String mainBoard, String GTX) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.gtx = GTX;
    }

    public static class Params {
        private String cpu;
        private String mainBoard;
        private String gtx;

        public Params() {

        }

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getMainBoard() {
            return mainBoard;
        }

        public void setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
        }

        public String getGtx() {
            return gtx;
        }

        public void setGtx(String gtx) {
            this.gtx = gtx;
        }

        public void apply(Computer computer) {
            computer.cpu = this.cpu;
            computer.mainBoard = this.mainBoard;
            computer.gtx = this.gtx;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", gtx='" + gtx + '\'' +
                '}';
    }
}
