package ex25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ex25.main25.password;
import static ex25.main25.pass_length;


public class Password_test {

    @Test
    void is_Password_Very_Weak() {
        //given
        password = "12345";
        pass_length = password.length();
        Password.passwordValidator();

        //when
        String actual = main25.output;
        String expect = "The password '12345' is a very weak password.";

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_Password_Weak() {
        //given
        password = "abcdef";
        pass_length = password.length();
        Password.passwordValidator();

        //when
        String actual = main25.output;
        String expect = "The password 'abcdef' is a weak password.";

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_Password_Average() {
        //given
        password = "1234567890";
        pass_length = password.length();
        Password.passwordValidator();

        //when
        String actual = main25.output;
        String expect = "The password '1234567890' is an average password.";

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_Password_Strong() {
        //given
        password = "abc123xyz";
        pass_length = password.length();
        Password.passwordValidator();

        //when
        String actual = main25.output;
        String expect = "The password 'abc123xyz' is a strong password.";

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_Password_Very_Strong() {
        //given
        password = "1337h@xor!";
        pass_length = password.length();
        Password.passwordValidator();

        //when
        String actual = main25.output;
        String expect = "The password '1337h@xor!' is a very strong password.";

        //then
        assertEquals(expect, actual);

    }
}
