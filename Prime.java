
/*import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for (i = 2; i < n; i++) {
            for (j = 2; j < n; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println(" " + i);
        }
    }
}
    */
/*import java.util.*;

public class Prime {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n number");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (i % 2 == 0) {
                    break;
                }
                if (i == j) {
                    System.out.println("" + i);
                }
            }
        }
    }
}
*/
import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the button number:");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("invalid");
        }

    }
}