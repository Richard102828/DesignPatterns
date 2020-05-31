package factory;

public class ColorFactory {
    private static Color color = null;
    public static Color createColor(String name) {
        switch (name) {
            case "bule":
                color = new Bule();
                break;
            case "red":
                color = new Red();
                break;
                default:
                    break;
        }
        return color;
    }
}
