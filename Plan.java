import java.util.*;
public class Plan
{
    public static void main(String ags[])
    {
        System.out.println("enter any string");
        String s = new Scanner(System.in).next();
        for(int i=0,j=s.length()-1;i<=j;i++,j--)
        {
            if(s.charAt(i)==s.charAt(j));
            else
            {
                System.out.println("not palindrome");
                System.exit(1);

            }
        }
        System.out.println("Palindrome");
    }
}
