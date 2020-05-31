package builder.complex;

/**
 * 根据apply()方法来
 */
public class BuildFactory {

    private Computer mComputer;

    public BuildFactory(Computer.Params params) {
        this.mComputer = mComputer;
    }

    public static class Builder {
        private Computer.Params params;

        public Builder() {
            params = new Computer.Params();
        }

        public Builder cpu(String cpu) {
            params.setCpu(cpu);
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            params.setMainBoard(mainBoard);
            return this;
        }

        public Builder gtx(String gtx) {
            params.setGtx(gtx);
            return this;
        }

        public BuildFactory build() {
            BuildFactory factory = new BuildFactory(params);
            params.apply(factory.mComputer);
            return factory;
        }

        public BuildFactory show() {
            System.out.println(build().mComputer);
            return build();
        }
    }
}
