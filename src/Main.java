import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);

    int cChoice;
    int check;
    int max;
    int guesses;
    boolean playAgain;
    String playerRepeat;
    int points;


    intro();

    do {

        menu();
        int choice = input.nextInt();

        max = max(choice);
        guesses = tries(choice);

        cChoice = computerChoice(max);

        //System.out.println(cChoice); //tester

        if (guesses < 0) {
            System.out.println("Antal gæt: ubegrænset");
        } else {
            System.out.println("Antal gæt: " + guesses);
        }

        do {
            System.out.println("gæt");
            int playerGuess = input.nextInt();

            check = guessChecker(playerGuess, cChoice);
            if (check == 1) { //win

            } else if (check == 2) {
                System.out.println("Lidt for højt gæt");
            } else if (check == 3) {
                System.out.println("For højt gæt");
            } else if (check == 4) {
                System.out.println("Lidt for lavt gæt");
            } else if (check == 5) {
                System.out.println("For lavt gæt");
            }
            else {
                System.out.println("fejl");
            }

            guesses = guesses - 1;
            if (guesses < 0) { //ubegrænset

            } else {
                System.out.println("Gæt tilbage: " + guesses);
            }

        } while ((check != 1) && (guesses != 0));

        points = pointsCal(guesses, choice, check);

        //end print
        if (check == 1) {
            System.out.println("Player win! Du optjente " + points + " points");
        } else if (guesses == 0) {
            System.out.println("Ikke flere forsøg, player lose, " + points + " points");
        } else {
            System.out.println("fejl i ending");
        }

        replayMenu();
        input.nextLine();
        playerRepeat = input.nextLine();
        playAgain = playerRepeat.equalsIgnoreCase("ja");
    } while (playAgain == true);




}



static int tries(int choice) {
    int tries = 0;

    switch  (choice) {
        case 1:
            tries = -1;
            break;
        case 2:
            tries = 10;
            break;
        case 3:
            tries = 7;
            break;
    }
    return tries;
}

static int max(int choice) {
    int max = 0;

    switch (choice) {
        case 1:
            max = 10;
        break;

        case 2:
            max = 50;
            break;

        case 3:
            max = 100;
            break;
    }
    return max;
}

static int computerChoice (int max) {
    int target = (int)(Math.random()*max)+1;
    return target;
}

public static int guessChecker (int playerGuess, int computerChoice) {
    int checker;
    int differens = playerGuess - computerChoice;
    if (differens == 0) {
        checker = 1; //korrekt
    } else if (differens <= 3 && differens > 0) { //lidt for høj
        checker = 2;
    } else if (differens > 3) { //for højt
        checker = 3;
    } else if (differens < 0 && differens >= -3) { //lidt for lav
        checker = 4;
    } else if (differens <-3) { //for lav
        checker = 5;
    } else { //fejl
        checker = 0;
    }
    return checker;
}

public static int pointsCal(int guesses, int choice, int check) {
    int points;
    if ((choice == 1 && guesses <-11 && check ==1) || (choice == 2 && guesses == 0 && check !=1) || (choice == 3 && guesses == 0 && check !=1)) {
        points = 0;
    } else if ((choice == 1 && guesses ==-2 && check ==1) || (choice == 2 && guesses == 9 && check ==1) || (choice == 3 && guesses == 6 && check ==1)) {
        points = 100;
    } else if (choice == 2) {
        points = (guesses+1) * (100/tries(choice));
    }else if (choice == 3) {
        points = (guesses+1) * (100/tries(choice));
    } else if (choice == 1 && guesses >= -11 && check ==1){ //let
        points = 100 + ((guesses+2) * 10);
    } else  {
        points = -99999; //fejlkode
    }
    return points;
}


//print

static void intro() {
    System.out.println("===============================================");
    System.out.println("       Velkommen til gæt et tal spillet.");
    System.out.println("    Jeg vælger et tal og du skal gætte det :)");
    System.out.println("===============================================");
}

static void menu() {
    System.out.println("===============================================");
    System.out.println("              Vælg sværhedsgrad:");
    System.out.println("     1. Let (1-10) med ubegrænset forsøg");
    System.out.println("     2. Mellem (1-50) med 10 forsøg");
    System.out.println("     3. Svær (1-100) med 7 forsøg");
    System.out.println("===============================================");
}

static void replayMenu() {
    System.out.println("===============================================");
    System.out.println("             Vil du spille igen? (j/n)");
    System.out.println("===============================================");
}