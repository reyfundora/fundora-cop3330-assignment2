package ex31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test

    public void is_Error_working() {
        //given
        main31.age_in = "a";
        main31.rate_in = "65";
        try {
            double age = Double.parseDouble(main31.age_in);
            double rate = Double.parseDouble(main31.age_in);
        } catch (Exception e) {
            main31.output = "Invalid input. Only enter numbers for bo" +
                    "th prompts. Try again.\n";
            System.out.println(main31.output);
        }

        //when
        String actual = main31.output;
        String expect = "Invalid input. Only enter numbers for both prompts. Try again.\n";

        //then
        assertEquals(expect, actual);
    }
}

