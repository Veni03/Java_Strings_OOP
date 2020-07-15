package Java_Strings;
import java.util.*;
public class Favorite_Programming_Language {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite programming language: ");
        String yourChoice = input.nextLine();
        if(yourChoice.equalsIgnoreCase("Java")){
            System.out.println("Good choice");
        }else{
            System.out.println("Try again");
        }



    }
}
