import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the red :");
        float red = sc.nextFloat();
        float pi = 3.14f;
        float cir = 3.14f * red * red;
        System.out.println("circle = " + cir);
    }
}
