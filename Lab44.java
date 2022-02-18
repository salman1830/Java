package Lab4;

import java.util.Scanner;

public class Lab44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b, c;
        System.out.println("Enter 1st String: ");
        a = in.nextLine();
        System.out.println("Enter 2nd String: ");
        b = in.nextLine();
        System.out.println("Enter 3rd String: ");
        c = in.nextLine();
        if (a.equals(b) == true) {
            System.out.println("String-1 is equal to String-2");
        } else if (a.equals(c) == true) {
            System.out.println("String-1 is equal to String-3");
        } else if (b.equals(c) == true) {
            System.out.println("String-2 is equal to String-3");
        } else {
            System.out.println("There are no equal Strings");
        }

    }
}
