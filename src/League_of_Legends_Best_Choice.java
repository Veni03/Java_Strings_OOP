import java.util.Scanner;

public class League_of_Legends_Best_Choice {

    public static boolean Continue_Action(String userChoice) {
        boolean continueAction = false;

        if (userChoice.equals("Y")) {
            continueAction = true;


        } else if (userChoice.equals("N")) {
            continueAction = false;

        } else {
            System.out.println("Wrong command, try again");
        }
        return continueAction;
    }

    public static void TOP() {
        System.out.println("GAREN");
        System.out.println("NASUS");
        System.out.println("JAX");
        System.out.println("VOLIBEAR");
        System.out.println("DARIUS");
        System.out.println("MORDEKAISER");
        System.out.println("URGOT");
        System.out.println("SETT");
        System.out.println("FIORA");

    }

    public static void JUNGLE() {
        System.out.println("MASTER YI");
        System.out.println("WARWICK");
        System.out.println("VOLIBEAR");
        System.out.println("VI");
        System.out.println("GRAVES");
        System.out.println("KAYN");
        System.out.println("FIDDLESTICKS");
        System.out.println("EKKO");

    }

    public static void MID() {
        System.out.println("DIANA");
        System.out.println("FIZZ");
        System.out.println("GALIO");
        System.out.println("EKKO");
        System.out.println("YASUO");
        System.out.println("KATARINA");
        System.out.println("ZED");


    }

    public static void ADC() {
        System.out.println("JINX");
        System.out.println("ASHE");
        System.out.println("JHIN");
        System.out.println("CAITLYN");
        System.out.println("VAYNE");
        System.out.println("EZREAL");


    }

    public static void SUPPORT() {
        System.out.println("BLITZCRANK");
        System.out.println("SORAKA");
        System.out.println("NAUTILLUS");
        System.out.println("LEONA");
        System.out.println("SENNA");
        System.out.println("LULU");
        System.out.println("BARD");
        System.out.println("THRESH");

    }

    public static void userMenu() {
        System.out.println("|------------------------|");
        System.out.println("|   Best champion pick   |");
        System.out.println("|------------------------|");
        System.out.println("Champions are listed from easy to hard!");
        System.out.println("Type 1 for TOP LANE");
        System.out.println("Type 2 for JUNGLE");
        System.out.println("Type 3 for MID LANE");
        System.out.println("Type 4 for ADC");
        System.out.println("Type 5 for SUPPORT");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueProcess = true;
        String userAction = null;
        userMenu();
        do {
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    TOP();
                    System.out.println("Do you want to see another role's best champions Y/N");
                    userAction = input.next();
                    continueProcess = Continue_Action(userAction);
                    break;
                case 2:
                    JUNGLE();
                    System.out.println("Do you want to see another role's best champions Y/N");
                    userAction = input.next();
                    continueProcess = Continue_Action(userAction);
                    break;
                case 3:
                    MID();
                    System.out.println("Do you want to see another role's best champions Y/N");
                    userAction = input.next();
                    continueProcess = Continue_Action(userAction);
                    break;
                case 4:
                    ADC();
                    System.out.println("Do you want to see another role's best champions Y/N");
                    userAction = input.next();
                    continueProcess = Continue_Action(userAction);
                    break;
                case 5:
                    SUPPORT();
                    System.out.println("Do you want to see another role's best champions Y/N");
                    userAction = input.next();
                    continueProcess = Continue_Action(userAction);
                    break;
                default:
                    System.out.println("No more roles");


            }
        } while (continueProcess != false);

    }

}
