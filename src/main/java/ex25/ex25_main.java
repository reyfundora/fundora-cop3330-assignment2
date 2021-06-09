/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex25;

import java.util.Scanner;

public class ex25_main {
    static String password;
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        password = input.nextLine();

        Password.very_strong();

    }
}
