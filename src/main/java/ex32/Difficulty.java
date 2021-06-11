/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex32;

import java.util.Scanner;

import static ex32.main32.level_num;

public class Difficulty {
    static void start_game() {
        Scanner input = new Scanner(System.in);
        String distance = "";

        int count = 1, min = 0, max = 0;
        if (level_num == 1) { min = 1; max = 10; }
        if (level_num == 2) { min = 1; max = 100; }
        if (level_num == 3) { min = 1; max = 1000; }
        int random_num = (int)Math.floor(Math.random() * (max - min + 1) + min);

        try {
            System.out.print("I have my number. What's your guess? ");
            String guess_in = input.next();
            int guess = Integer.parseInt(guess_in);

            if (guess == random_num) System.out.println("You got it on your first try!\n");
            else {
               while(guess != random_num) {
                   if (guess < random_num) distance = "Too low. ";
                   if (guess > random_num) distance = "Too high. ";

                   System.out.print(distance + "Guess again: ");
                   guess_in = input.next();
                   guess = Integer.parseInt(guess_in);
                   count++;
               }
            }
            if (count != 1) System.out.printf("You got it in %d guesses!", count);
        }

        catch (Exception e) {
            System.out.println("Invalid input. Please only enter integer values for your guesses. Try again.");
        }
    }
}
