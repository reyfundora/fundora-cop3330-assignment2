/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex29;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ex29.main29.rot_in;

public class main_test {
    @Test
    void is_output_working() {
        //given
        rot_in = "4";
        main29.user_input_checker();

        //when
        String actual = main29.output;
        String expect = "It will take 18 years to double your initial investment.";

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_rot_is_0_working() {
        //given
        rot_in = "0";
        main29.user_input_checker();

        //when
        String actual = main29.output;
        String expect = "Rate of return with a value of 0 is not allowed. Try again.";

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_error_working() {
        //given
        rot_in = "r";
        main29.user_input_checker();

        //when
        String actual = main29.output;
        String expect = "Sorry. That's not a valid input.";

        //then
        assertEquals(expect, actual);
    }

}