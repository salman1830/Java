package Lab4;

import java.util.Scanner;

public class Lab43 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x, y, z, merge;
        System.out.println("Enter 1st String: ");
        x = in.nextLine();
        //in.nextLine();
        System.out.println("Enter 2nd String: ");
        y = in.nextLine();
        //in.nextLine();
        System.out.println("Enter 3rd String: ");
        z = in.nextLine();
        merge = x.concat(y);
        merge = merge.concat(z);
        System.out.println("Merge String = " + merge);
    }

}
