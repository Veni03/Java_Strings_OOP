package Java_Strings;
import java.util.Scanner;

public class Strings {
    public static String Second_word_Position(String a , String b){
        System.out.println("Second word on position :" + a.indexOf(b));
        return a;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.nextLine();
        String secondWord= input.next();
        Second_word_Position(firstWord, secondWord);
    }

}