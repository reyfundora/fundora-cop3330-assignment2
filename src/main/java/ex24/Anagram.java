package ex24;

import java.util.Arrays;
import java.util.Scanner;


class Anagram {
    static String first, second, output = "The two words are not anagrams.";

    static void user_input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams!\n" +
                "Enter the first string: ");
        Anagram.first = input.nextLine();
        System.out.print("Enter the second string: ");
        Anagram.second = input.nextLine();
    }

    static boolean isSameLength() {
        int length_first = first.length();
        int length_second = second.length();
        return length_first == length_second;
    }

    static boolean isAnagram() {
        String yes = "\"" + first + "\"" + " and " + "\"" + second + "\"" + " are anagrams.";
        String error = "\nAnagrams have to be the same length. Try again.\n";

        if (isSameLength()) {
            int length_both = first.length();

            char[] first_abc = first.toCharArray();
            Arrays.sort(first_abc);
            char[] second_abc = second.toCharArray();
            Arrays.sort(second_abc);

            for (int i = 0; i < length_both; i++) {
                if (first_abc[i] != second_abc[i]) break;
                else output = yes;
            }
            System.out.println(output);
            return true;

        } else System.out.println(error);
        return false;
    }
}