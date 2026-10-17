package com.nonso;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    static void main(String[] arg) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int userGuess;

        int noOfTrial = 0;

        do {
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Your guess is less than random number. Try again");

            }else if(userGuess > randomNumber){
                System.out.println("Your guess is greater than random number. Try again");
            }else if(userGuess == randomNumber) {
                System.out.println("Congratulations");
                break;
            }

            noOfTrial = noOfTrial + 1;

            if (noOfTrial == 10) {
                System.out.println("Game over");
                break;

            }

        } while (noOfTrial <= 10);





    }

}



