package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static ex27.main27.first_name;
import static ex27.main27.last_name;
import static ex27.main27.zip_in;
import static ex27.main27.ID_in;

public class Validation_Test {

    @Test
    void is_Error_Code_Working_If_Wrong() {
        //given
        first_name = "R";
        last_name = "F";
        zip_in = "331422343523";
        ID_in = "RF+1234";
        Validation.validateInput();

        //when
        String actual = Validation.output;
        String expect = "The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The zipcode must be a 5 digit number.\n" +
                "The employee ID must be in the format of AA-1234.\n";

        //then
        assertEquals(expect, actual);
    }

    @Test
    void is_Zip_Code_Only_Numbers() {
        //given
        first_name = "John";
        last_name = "Johnson";
        zip_in = "ABCDE";
        ID_in = "TK-4321";
        Validation.validateInput();

        //when
        String actual = Validation.output;
        String expect = "Please only input numbers into your zip code.\n";

        //then
        assertEquals(expect, actual);
    }
}

