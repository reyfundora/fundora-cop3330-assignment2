/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex26;

import java.util.Scanner;

public class   main26 {
    static String balance_in, rate_in, payment_in;
    static String output;
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        balance_in = input.nextLine();
        System.out.print("What is the APR on the card (as a percent)? ");
        rate_in = input.nextLine();
        System.out.print("What is the monthly payment you can make? ");
        payment_in = input.nextLine();

        PaymentCalculator.calculateMonthsUntilPaidOff();

        System.out.println(output);
    }
}