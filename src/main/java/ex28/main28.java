/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex28;

import java.util.Scanner;

public class main28 {
    static double[] user_input = new double[5];
    static void user_input() {
        Scanner input = new Scanner(System.in);

        // Input_Loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            String for_in = input.next();

            try {
                double for_num = Double.parseDouble(for_in);
                user_input[i] = for_num;
            }
            catch (Exception e) {
                System.out.println("\nPlease make sure you are only inputting numbers. Try again.\n");
                i--;
            }
        }
    }

    public static void main (String[] args) {
        user_input();

        // Output_Loop
        double output = 0;
        for (int i = 0; i < 5; i++) {
            output = output + user_input[i];
        }

        System.out.println("The total is " + output);
    }
}
