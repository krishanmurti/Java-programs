
//if else
/*import java.util.*;

public class condition {
    public static void main(String args[]) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

    }

}*/
//else if
/*import java.util.*;

public class condition {
    public static void main(String args[]) {
        System.out.println("enter a number:");
        System.out.println("enter b number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater");
        } else if (a < b) {
            System.out.println("a is lesser");
        } else {
            System.out.println("a is equal");
        }

    }
}*/
//Switch break
import java.util.*;

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
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
