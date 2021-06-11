/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex31;

import java.util.Scanner;

public class main31 {
    static String output;
    static double age, rate;

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("What is your age? ");
            String age_in = input.next();
            System.out.print("What is your resting heart rate (in bpm)? ");
            String rate_in = input.next();

            try {
                age = Double.parseDouble(age_in);
                rate = Double.parseDouble(rate_in);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid input. Only enter numbers for both prompts. Try again.\n");
            }
        }

        Karvonen.output_build();
        System.out.println(output);
    }
}
