package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static ex27.main27.first_name;
import static ex27.main27.last_name;
import static ex27.main27.zip_in;
import static ex27.main27.ID_in;

public class main_test {

    @Test
    void is_Correct_Code_Working() {
        //given
        first_name = "John";
        last_name = "Johnson";
        zip_in = "55555";
        ID_in = "TK-4321";
        Validation.validateInput();

        //when
        String actual = Validation.output;
        String expect = "There were no errors found.";

        //then
        assertEquals(expect, actual);
    }
}
