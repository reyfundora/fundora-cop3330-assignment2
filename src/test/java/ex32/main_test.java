package ex32;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_Error_Working() {
        //given
        int level_num;
        String error_output = "";
        String level = "4";
        try {
            level_num = Integer.parseInt(level);
            if (0 < level_num && level_num < 4) Difficulty.start_game();
            else if (level_num > 3) throw new Exception();
        } catch (Exception e) {
            error_output = "Invalid input. For difficulty, only enter 1, 2, or 3. Try again.";
            System.out.println(error_output);
        }

        //when
        String actual = error_output;
        String expect = "Invalid input. For difficulty, only enter 1, 2, or 3. Try again.";

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_Error_Working2() {
        //given
        int level_num;
        String error_output = "";
        String level = "r";
        try {
            level_num = Integer.parseInt(level);
            if (0 < level_num && level_num < 4) Difficulty.start_game();
            else if (level_num > 3) throw new Exception();
        } catch (Exception e) {
            error_output = "Invalid input. For difficulty, only enter 1, 2, or 3. Try again.";
            System.out.println(error_output);
        }

        //when
        String actual = error_output;
        String expect = "Invalid input. For difficulty, only enter 1, 2, or 3. Try again.";

        //then
        assertEquals(expect, actual);
    }
}