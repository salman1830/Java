package grade;

import java.util.Scanner;

public class sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Necessary number of arrays:");
        int n = input.nextInt();
        int i;
        int[] array1 = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("\nThe array elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(array1[i]);
        }
    }
}
