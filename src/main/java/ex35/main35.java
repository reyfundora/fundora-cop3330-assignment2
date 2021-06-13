/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex35;


import java.util.Scanner;

public class main35 {
    static String name, output;
    static int input_num;
    static String[] roster = new String[1000];

    static void math() {
        int min = 0, max = input_num - 1;
        int random_num = (int)Math.floor(Math.random() * (max - min + 1) + min);

        output = "The winner is... " + roster[random_num] + ".";
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            input_num++;
            roster[input_num - 1] = name;

            if (!name.equals("")) math();
            else {
                System.out.println(output);
                break;
            }
        }
    }
}