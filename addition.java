import java.util.Scanner;

public class addition {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        a = sc.nextInt();
        System.out.println("enter the second number");
        b = sc.nextInt();
        c = a + b;
        System.out.println("addition of two numbers a and b is:" + c);
        c = a * b;
        System.out.println("multiplication of two numbers a and b is:" + c);
        c = a / b;
        System.out.println("division of two numbers a and b is:" + c);
    }

}