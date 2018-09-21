import java.util.Scanner;

import static java.lang.Math.random;

public class numberGuessing {
    public static void main(String[]args){


Scanner keyboard;
    int pickedNumber, userInput;

    keyboard = new Scanner(System.in);
    pickedNumber =(int) (Math.random()*100);
        do {

            System.out.println("Pick a number between 0-100");
            userInput = keyboard.nextInt();
            if (userInput==pickedNumber){
                System.out.println("You got it!");
            }
            else if (userInput>pickedNumber)
                System.out.println("Too high");
            else if (userInput<pickedNumber)
            System.out.println("Too low");
        }while(pickedNumber!=userInput);
    }
}
