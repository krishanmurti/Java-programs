import java.util.Scanner;
public class new {
    public static void main(String args[]) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        int n = sc.next.nextInt();
        System.out.println("enter the value of n");
        for(i=2;i<n;i++) {
            for(j=2;j<n;j++) {
                if(i%j == 0) break;

            }
            if(i==j)
            System.out.println(" " +i);
        }
    }
}