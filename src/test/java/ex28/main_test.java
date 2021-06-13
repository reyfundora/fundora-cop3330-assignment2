package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ex28.main28.user_input;

public class main_test {
    @Test
    void is_Output_Working() {
        //given
        user_input[0] = 1;
        user_input[1] = 2;
        user_input[2] = 3;
        user_input[3] = 4;
        user_input[4] = 5;
        double output = 0;

        //when
        double actual = output = output + user_input[0] + user_input[1] + user_input[2] + user_input[3] + user_input[4];
        double expect = 15;

        //then
        assertEquals(expect, actual);
    }
}