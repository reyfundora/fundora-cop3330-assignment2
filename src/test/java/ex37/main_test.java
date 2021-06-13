package ex37;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_error_working() {
        //given
        String output = "";
        String length_in = "5";
        String special_in = "5";
        String num_in = "r";

        //when
        try {
            int min_length = Integer.parseInt(length_in);
            int spl_length = Integer.parseInt(special_in);
            int num_length = Integer.parseInt(num_in);
        }
        catch (Exception e){
            output = """
                        
                 INVALID INPUT
                 Only enter whole numbers when prompted. Try again.
                 """;
        }

        String actual = output;
        String expect = """
                        
                 INVALID INPUT
                 Only enter whole numbers when prompted. Try again.
                 """;

        //then
        assertEquals(expect, actual);
    }
}
