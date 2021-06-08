
package ex24;

import java.util.Scanner;

public class ex24_main {
    static void user_input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams!\n" +
                         "Enter the first string: ");
        Anagram.first = input.nextLine();
        System.out.print("Enter the second string: ");
        Anagram.second = input.nextLine();
    }

    public static void main(String[] args) {
        do user_input();
        while (!Anagram.isAnagram());
    }
}