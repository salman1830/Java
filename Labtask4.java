package labtask4;

import java.util.Scanner;
import java.lang.Math;

public class Labtask4 {

    public static int maxValue(int a, int b) {
        return (Math.max(a, b));
    }

    public static void main(String[] args) {
        int x, y, max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x = input.nextInt();
        y = input.nextInt();
        max = maxValue(x, y);
        System.out.println("Maximum Value=" + max);
    }
}
