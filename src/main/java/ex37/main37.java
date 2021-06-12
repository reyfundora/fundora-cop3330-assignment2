/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex37;

import java.util.Scanner;

public class main37 {
    static int min_length, spl_length, num_length;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("What's the minimum length? ");
                String length_in = input.next();
                System.out.print("How many special characters? ");
                String special_in = input.next();
                System.out.print("How many numbers? ");
                String num_in = input.next();

                min_length = Integer.parseInt(length_in);
                spl_length = Integer.parseInt(special_in);
                num_length = Integer.parseInt(num_in);

                Password.generate();
                System.out.print("\n");
                break;
            }
            catch (Exception e) {
               System.out.println("""
                        
                 INVALID INPUT
                 Only enter whole numbers when prompted. Try again.
                 """);
           }
        }
    }
}
