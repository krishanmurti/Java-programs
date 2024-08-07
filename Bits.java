
/*import java.util.*;

public class Bits {
    

    public static void main(String args[]) {
        int n = 5;
        int position = 2;
        int bitMash = 1 << position;
        if (bitMash & n == 0) {
            System.out.println("bitMash was zero");
        } else {
            System.out.println("bitMash was one");
        }
    }
}
*/
// set bit
/*import java.util.*;

public class Bits {
    public static void main(String args[]) {
        int n = 5;
        int position = 1;
        int bitMash = 1 << position;
        int newNumber = bitMash | n;
        System.out.println(newNumber);
    }
}
*/

//Clear bit
import java.util.*;

public class Bits {
    public static void main(String args[]) {
        int n = 5;
        int position = 2;
        int bitMash = 1 << position;
        int notbitMash = ~(bitMash);
        int newNumber = notbitMash & n;
        System.out.println(newNumber);

    }
}