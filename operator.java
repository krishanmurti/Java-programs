/*import java.util.*;

public class operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second number: ");
        int num2 = sc.nextInt();
        c = num1 + num2;
        System.out.println("addition of num1+num2:" + c);
    }

}*/

import java.util.*;

public class operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if (n / 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
    }
}
