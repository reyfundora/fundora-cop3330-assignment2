/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex34;

import java.util.Scanner;

public class main34 {
    static int roster_num = 5;
    static String name;
    static String[] roster = new String[5];

    static void removal() {
        for (int i = 0; i < 5; i++) {
            if (name.equals(roster[i]) && !roster[i].equals("")) {
                roster[i] = "";
                roster_num--;
            }
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        roster[0] = "John Smith";
        roster[1] = "Jackie Johnson";
        roster[2] = "Chris Jones";
        roster[3] = "Amanda Cullen";
        roster[4] = "Jeremy Goodwin";

        while(true) {
            System.out.println("There are " + roster_num + " employees:");

            for (int i = 0; i < 5; i++) {
                if (!roster[i].equals("") )
                System.out.println(roster[i]);
            }

            System.out.print("\nEnter an employee name to remove: ");
            name = input.nextLine();
            System.out.print("\n");

            removal();

            if (roster_num == 0) {
                System.out.println("No more employees left to remove.");
                break;
            }
        }
    }
}
