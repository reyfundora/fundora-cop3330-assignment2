/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */


package ex27;

import java.util.Scanner;

public class main27 {
    static String first_name, last_name, zip_in, ID_in;
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        first_name = input.nextLine();
        System.out.print("Enter the last name: ");
        last_name = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip_in = input.nextLine();
        System.out.print("Enter the employee ID: ");
        ID_in = input.nextLine();

        Validation.validateInput();

        System.out.println(Validation.output);
    }
}
