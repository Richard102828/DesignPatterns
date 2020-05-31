package factory;

public class Bule implements Color {
    @Override
    public void draw() {
        System.out.println("bule");
    }
}
class Red implements Color {
    @Override
    public void draw() {
        System.out.println("red");
    }
}