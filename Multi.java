
package grade;
import java.util.Scanner;

public class Multi {
   public static void main(String[] args) {    
        Scanner A = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a;
        a= A.nextInt();
        System.out.println("Enter b: ");
        int b = A.nextInt();
        System.out.println("Enter c: ");
        int c = A.nextInt();
        if(a>=b && a>=c){
            System.out.println(a + " is the maximum number.");
        }
        else if (b >= a && b >= c){
            System.out.println(b + " is the maximum number.");
        }
        else
            System.out.println(c + " is the maximum number.");
    }
    }

