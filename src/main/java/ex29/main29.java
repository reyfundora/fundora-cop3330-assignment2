/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex29;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main29 {
    static String rot_in, output;

    static void user_input_checker() {
        try {
            double rot = Double.parseDouble(rot_in);
            if (rot != 0) {
                double years = 72 / rot;
                DecimalFormat df = new DecimalFormat("0");

                output = "It will take " + df.format(years) + " years to double your initial investment.";
            }
            else output = "Rate of return with a value of 0 is not allowed. Try again.";
        }
        catch (Exception e) {
            output = "Sorry. That's not a valid input.";
            rot_in = "0";
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("What is the rate of return? ");
            rot_in = input.nextLine();

            user_input_checker();

            System.out.println(output);
        }
        while (rot_in.equals("0"));
    }
}