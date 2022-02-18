package grade;

import java.util.Scanner;

public class Labtask3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double area;
        System.out.println("Enter r");
        r = input.nextDouble();
        area = Math.PI * Math.pow(r, 2);
        System.out.println("Area is :" + area);

    }

}
