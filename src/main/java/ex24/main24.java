/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex24;

import java.util.Scanner;

public class main24 {
    static void user_input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams!\n" +
                         "Enter the first string: ");
        Anagram.first = input.nextLine();
        System.out.print("Enter the second string: ");
        Anagram.second = input.nextLine();
    }

    public static void main(String[] args) {
        do {
            user_input();
        } while (!Anagram.isAnagram());
    }
}
