
/*import java.util.*;

public class String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is:" + name);
    }

}*/
//concatenation
/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String firstName = "tony";
        String secondName = "Stark";
        String fullName = firstName + secondName;
        System.out.println(fullName);
    }
}
*/

//compare
/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        String name1 = "tony";
        String name2 = "sony";
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}*/

//Substring
/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        String sentence = "tonyStark";
        String name = sentence.substring(4);
        System.out.println(name);
    }
}*/

//StringBuilder

/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        // set char
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        // insert
        sb.insert(3, 's');
        System.out.println(sb);
        // Delete
        sb.delete(2, 4);
        System.out.println(sb);

        

    }
}*/

//append
/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        // length
        sb.length(sb);
        System.out.println(sb);
    }
}*/

//Reverse String
import java.util.*;

public class Strings {
    public static void main(String args[])[
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            Char frontChar=sb.charAt(front);
            Char backChar=sb.charAt(back);
            sb.setcharAt(front,backChar);
            sb.setcharAt(back,frontChar);
        }
        System.out.println(sb);
    ]
}