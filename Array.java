/*import java.util.*;

public class Array {
    public static void main(String args[]) {
        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 89;
        marks[2] = 78;
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

    }

}*/

import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found index" + i);
            }
        }
    }
}