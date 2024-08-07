import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fib {
    public static void main(String args[]) throws Exception {
        System.out.println("enter the nth number");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        System.out.println("nth fibonacci number is" + fib(n));
    }

    public static int fib(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

}
