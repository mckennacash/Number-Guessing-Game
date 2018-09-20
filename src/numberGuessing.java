import java.util.Scanner;

import static java.lang.Math.random;

public class numberGuessing {


    public static void main(String[]args){


Scanner keyboard;
    int pickedNumber, userInput;
    keyboard = new Scanner(System.in);


    pickedNumber =(int) (Math.random()*100);
        System.out.println(pickedNumber);
    System.out.println("Pick a number between 0-100");
        userInput = keyboard.nextInt();

        for (int pickedNumber: userInput){


        }















       /* if (userInput==pickedNumber){
            System.out.println("You win!");

        }
        else if(userInput<pickedNumber){

            System.out.println("Too low! Guess higher");
            userInput = keyboard.nextInt();
        }
        else if (userInput>pickedNumber){

            System.out.println("Too high! Guess lower");
            userInput = keyboard.nextInt();
        }*/








    }
}
