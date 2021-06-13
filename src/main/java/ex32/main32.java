/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex32;

import java.util.Scanner;

public class main32 {
    static int level_num;

    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Let's play Guess the Number!\n" +
                    "Enter the difficulty level (1, 2, or 3): ");
            String level = input.nextLine();

            try {
                level_num = Integer.parseInt(level);
                if (0 < level_num && level_num < 4) Difficulty.start_game();
                else if (level_num > 3) throw new Exception();
            } catch (Exception e) {
                String error_output = "Invalid input. For difficulty, only enter 1, 2, or 3. Try again.";
                System.out.println(error_output);
            }

            while(true) {
                System.out.println("\n");
                System.out.print("Do you wish to play again (Y/N)? ");
                String again = input.nextLine();

                if (again.equals("y") || again.equals("Y")) break;
                if (again.equals("n") || again.equals("N")) return;
                else System.out.print("Invalid input. Only enter Y or N for previous question.");
            }
        }
    }
}
