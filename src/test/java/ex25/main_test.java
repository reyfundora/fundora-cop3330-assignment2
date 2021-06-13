package ex25;

import org.junit.jupiter.api.Test;

import static ex25.main25.pass_length;
import static ex25.main25.password;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_Password_Length_Working() {
        //given
        password = "12345";
        pass_length = password.length();

        //when
        int actual = pass_length;
        int expect = 5;

        //then
        assertEquals(expect, actual);
    }
}