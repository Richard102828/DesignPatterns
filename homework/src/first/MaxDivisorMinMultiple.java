package first;

import java.util.Scanner;

/**
 * Java 第一次课程 作业_1
 */
public class MaxDivisorMinMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("Enter m, n:");
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println(m + "," + n + "max common divisor is" + maxCommonDivisor(m, n));
        System.out.println(m + "," + n + "min common multiple" + minCommonMultiple(m, n));
    }

    public static int maxCommonDivisor(int m, int n) {
        int commonDivisor;
        if (m < n) {
            commonDivisor = m;
        } else {
            commonDivisor = n;
        }
        while (m % commonDivisor != 0 || n % commonDivisor != 0) {
            commonDivisor--;
        }
        return commonDivisor;
    }

    public static int minCommonMultiple(int m, int n) {
        int commonMultiple;
        if (m > n) {
            commonMultiple = m;
        } else {
            commonMultiple = n;
        }
        while (commonMultiple % m != 0 || commonMultiple % n != 0) {
            commonMultiple++;
        }
        return commonMultiple;
    }
}
