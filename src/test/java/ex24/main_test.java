/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex24;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_User_Input_Occurring1() {
        // given
        Anagram.first = "test";
        Anagram.second = "test";
        Anagram.isAnagram();

        // when
        String expected = Anagram.output;
        String actual = "\"" + Anagram.first + "\"" + " and " + "\"" + Anagram.second +
                        "\"" + " are anagrams.";

        // then
        assertEquals(expected, actual);
    }

}
