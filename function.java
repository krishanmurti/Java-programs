/*import java.util.*;

public class function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }

}*/

/*import java.util.*;

public class function {
    public static void CalculateSum(int a, int b) {
        int sum = a + b;
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a number:");
        int a = sc.nextInt();
        System.out.println("enter the b number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of 2 number is:" + sum);
    }
}*/

import java.util.*;

public class function {
    public static void printFactorial(int n){
        int factorial=1;
        for(int i=n;i>=1;i++){
            factorial=factorial*i;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            
            int n=sc.nextInt();
            printFactorial(n);
        }
    }
}
