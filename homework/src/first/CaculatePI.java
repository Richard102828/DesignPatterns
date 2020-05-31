package first;

/**
 * java 第一次课程 作业_2
 */
public class CaculatePI {
    public static void main(String[] args) {
        System.out.println("Π = % 6.f" + pI());
    }

    public static double pI() {
        double result = 0;
        double item = 0;
        int denominator = 1;
        int sign = 1;
        do {
            item = (double) sign / denominator;
            result += item;
            sign = -sign;
            denominator += 2;
        } while (Math.abs((double) sign / denominator) >= 1e-6);
        return result;
    }
}
