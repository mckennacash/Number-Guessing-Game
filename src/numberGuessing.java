import java.util.Scanner;

import static java.lang.Math.random;

public class numberGuessing {
    public static void main(String[]args) {


        Scanner keyboard;
        int pickedNumber, userInput;

        String userAnswer;
        String userContinue;
        boolean game = false;

        keyboard = new Scanner(System.in);
        do {
            pickedNumber = (int) (Math.random() * 100);

              do {
                  System.out.println("Pick a number between 0-100");
                  userInput = keyboard.nextInt();
                  keyboard.nextLine();
                  if (userInput == pickedNumber) {
                      System.out.println("You got it!");
                  } else if (userInput > pickedNumber)
                      System.out.println("Too high");
                  else if (userInput < pickedNumber)
                      System.out.println("Too low");
              } while (pickedNumber != userInput);




           System.out.println("Want to play again?");

            userAnswer = keyboard.nextLine();
            if (userAnswer.equalsIgnoreCase("no")){break;}

        }while (!userAnswer.equalsIgnoreCase("no"));




    }
}
