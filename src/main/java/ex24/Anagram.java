package ex24;

import java.util.Arrays;

class Anagram {
    static String first, second, output = "The two words are not anagrams.";

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