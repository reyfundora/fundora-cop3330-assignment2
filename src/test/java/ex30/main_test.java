package ex30;

import org.junit.jupiter.api.Test;

import static ex30.main30.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_Integer_Conversion_Working() {
        //given
        x_in = "12";
        x = Integer.parseInt(x_in);

        //when
        int expect = 12;
        int actual = x;

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_Integer_Conversion_Working2() {
        //given
        y_in = "12";
        y = Integer.parseInt(y_in);

        //when
        int expect = 12;
        int actual = y;

        //then
        assertEquals(expect, actual);

    }
}
