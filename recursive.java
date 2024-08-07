import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class recursive
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("enter nth nuber");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        System.out.println("nth fibonacci number is" +fibonacci(n));

    }
    public static int fibonacci(int n)
    {
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++){
            c=a+b;a=b;b=c;
        }
        return a;
    }
}