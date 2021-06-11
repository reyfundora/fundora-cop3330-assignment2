/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex30;

import java.util.Scanner;

public class main30 {
    static String x_in, y_in;
    static int x, y;

    static void math(){
        x = Integer.parseInt(x_in);
        y = Integer.parseInt(y_in);

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++)
                System.out.format("%5d", i * j);
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x-axis limit for table: ");
        x_in = input.nextLine();
        System.out.print("Input y-axis limit for table: ");
        y_in = input.nextLine();
        System.out.print("\n");

        math();
    }
}
