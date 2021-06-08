package ex24;

import java.util.Scanner;

class Anagram {
    static String first, second;

    static void user_input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams!\n" +
                         "Enter the first string: ");
        first = input.nextLine();
        System.out.print("Enter the second string: ");
        second = input.nextLine();
    }

    static boolean isSameLength () {
        int length_first = first.length();
        int length_second = second.length();

        if (length_first == length_second) return true;
        else {
            System.out.println("Please input two strings that are the same length. Try again.");
            return false;
        }
    }

    static boolean isAnagram() {
        if (isSameLength()) return true;

        return false;
    }
}
