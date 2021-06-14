/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex33;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class main_test {
    static String[] answer = new String[4];

    @Test
    void is_main_method_working() {
        //given
        answer[0] = "Yes.";
        answer[1] = "No.";
        answer[2] = "Maybe.";
        answer[3] = "Ask again later.";
        main33.array_method();

        //when
        String expect = "Yes.";
        String actual = answer[0];

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_main_method_working2() {
        //given
        answer[0] = "Yes.";
        answer[1] = "No.";
        answer[2] = "Maybe.";
        answer[3] = "Ask again later.";
        main33.array_method();

        //when
        String expect = "No.";
        String actual = answer[1];

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_main_method_working3() {
        //given
        answer[0] = "Yes.";
        answer[1] = "No.";
        answer[2] = "Maybe.";
        answer[3] = "Ask again later.";
        main33.array_method();

        //when
        String expect = "Maybe.";
        String actual = answer[2];

        //then
        assertEquals(expect, actual);
    }    @Test
    void is_main_method_working4() {
        //given
        answer[0] = "Yes.";
        answer[1] = "No.";
        answer[2] = "Maybe.";
        answer[3] = "Ask again later.";
        main33.array_method();

        //when
        String expect = "Ask again later.";
        String actual = answer[3];

        //then
        assertEquals(expect, actual);
    }
}
