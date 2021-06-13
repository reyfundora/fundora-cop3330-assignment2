package ex37;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Password_Test {
    @Test
    void is_password_working() {
        //given
        main37.min_length = 8;
        main37.spl_length = 2;
        main37.num_length = 2;

        //when
        Password.generate();

        int actual = main37.min_length;
        int expect = 9;

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_password_working2() {
        //given
        main37.min_length = 8;
        main37.spl_length = 6;
        main37.num_length = 6;

        //when
        Password.generate();

        int actual = main37.min_length;
        int expect = 25;

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_password_working3() {
        //given
        main37.min_length = 8;
        main37.spl_length = 0;
        main37.num_length = 0;

        //when
        Password.generate();

        int actual = main37.min_length;
        int expect = 8;

        //then
        assertEquals(expect, actual);
    }
}
