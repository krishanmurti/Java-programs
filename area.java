import java.util.Scanner;

public class area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth red");
        float red = sc.nextFloat();
        float pi = 3.14f;
        float circle = 3.14f * red * red;
        System.out.println("circle" + circle);
    }
}
