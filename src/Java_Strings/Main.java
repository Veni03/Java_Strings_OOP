//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Hello GitHub Project!");
//    }
//}
package Java_Strings;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.lang.String myName = input.nextLine();
        System.out.println("First Letter is: " + myName.charAt(0));
        System.out.println("Last Letter is: " + myName.charAt(myName.length() - 1));
        System.out.println("Length: " + myName.length());
    }

}
