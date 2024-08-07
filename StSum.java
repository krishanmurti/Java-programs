import java.util.Scanner;
import java.util.StringTokenizer;
public class StSum {
    public static void main(String args[]) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer separated by a space:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, "");
        while(st.hasMoreTokens())
        {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum+=n;
        }
        System.out.println("sum is" +sum);
    }
}
