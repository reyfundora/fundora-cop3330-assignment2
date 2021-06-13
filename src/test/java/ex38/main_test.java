package ex38;

import org.junit.jupiter.api.Test;

import static ex38.main38.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_User_Input_going_into_String_array() {
        //given
        main38.numbers_in = "1 2 3 4 5";

        //when
        filterEvenNumbers();

        String expect = "1";
        String actual = numbers_in_array[0];

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_User_Input_going_into_String_array2() {
        //given
        main38.numbers_in = "1 2 3 4 5";

        //when
        filterEvenNumbers();

        String expect = "5";
        String actual = numbers_in_array[4];

        //then
        assertEquals(expect, actual);
    }

    @Test
    void are_even_numbers_being_filtered() {
        //given
        main38.numbers_in = "1 2 3 4 5";

        //when
        filterEvenNumbers();

        double expect = 2;
        double actual = numbers_even[1];

        //then
        assertEquals(expect, actual);
    }
    @Test
    void are_even_numbers_being_filtered2() {
        //given
        main38.numbers_in = "1 2 3 4 5";

        //when
        filterEvenNumbers();

        double expect = 4;
        double actual = numbers_even[2];

        //then
        assertEquals(expect, actual);
    }
}
