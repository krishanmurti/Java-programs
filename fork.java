import java.util.*;

public class fork {
    public static void main(String args[]) {
        int a, b, c, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        a = sc.nextInt();
        System.out.println("enter the second number");
        b = sc.nextInt();
        System.out.println("enter the third number");
        c = sc.nextInt();
        sum = a + b + c;
        System.out.println("the sum of three numbers a,b and c:" + sum);
    }
}