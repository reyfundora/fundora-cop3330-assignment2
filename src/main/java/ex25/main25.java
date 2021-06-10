/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex25;

import java.util.Scanner;

public class main25 {
    static String password, output;
    static int pass_length;

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        password = input.nextLine();
        pass_length = password.length();

        Password.passwordValidator();

        System.out.println(output);
    }
}
