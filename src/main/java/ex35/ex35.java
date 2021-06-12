/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex35;

import java.util.Scanner;

public class ex35 {
    static String name, output;
    static int input_num;

    static void array_method() {
        String[] roster = new String[input_num];
        for (int i = 0; i < input_num; i++);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            input_num++;

            if (!name.equals("")) array_method();
            else {
                System.out.println(output);
                break;
            }
        }
    }
}
