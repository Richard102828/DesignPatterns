package builder.simple;

import builder.simple.Builder;

public class Diretor {

    public void consruct(Builder builder) {
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildGTX();
    }
}
