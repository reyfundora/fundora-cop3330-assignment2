/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex35;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ex35.main35.roster;

public class main_test {
    @Test
    void is_random_winner_working() {
        //given
        roster[0] = "John Smith";
        roster[1] = "Jackie Johnson";
        roster[2] = "Chris Jones";
        roster[3] = "Amanda Cullen";
        roster[4] = "Jeremy Goodwin";
        int random_num = 0;
        String output = "The winner is... " + roster[random_num] + ".";

        //when
        main35.math();

        String expect = "The winner is... John Smith.";
        String actual = output;

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_random_winner_working2() {
        //given
        roster[0] = "John Smith";
        roster[1] = "Jackie Johnson";
        roster[2] = "Chris Jones";
        roster[3] = "Amanda Cullen";
        roster[4] = "Jeremy Goodwin";
        int random_num = 2;
        String output = "The winner is... " + roster[random_num] + ".";

        //when
        main35.math();

        String expect = "The winner is... Chris Jones.";
        String actual = output;

        //then
        assertEquals(expect, actual);
    }
}
