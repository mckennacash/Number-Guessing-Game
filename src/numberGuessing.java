import java.util.Scanner;

import static java.lang.Math.random;

public class numberGuessing {
    public static void main(String[]args) {


        Scanner keyboard;
        int pickedNumber, userInput;
        int tries = 0;
        String userAnswer;
        String userContinue;
        boolean game = false;

        keyboard = new Scanner(System.in);
        do {
            pickedNumber = (int) (Math.random() * 100);
            System.out.println("You have 6 tries to guess the right number. Want to play?");
            keyboard.nextLine();
            do {

                System.out.println("Pick a number between 0-100");
                userInput = keyboard.nextInt();
                keyboard.nextLine();
                if (userInput == pickedNumber) {
                    System.out.println("You got it!");
                } else if (userInput > pickedNumber) {
                    System.out.println("Too high");
                }

                if (userInput < pickedNumber) {
                    System.out.println("Too low");
                }
                tries++;

            } while (tries <=6 && pickedNumber != userInput);

            System.out.println("Want to play again?");


            userAnswer = keyboard.nextLine();


        }while(!userAnswer.equalsIgnoreCase("no"));




    }

}
