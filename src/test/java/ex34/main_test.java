package ex34;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ex34.main34.roster;

public class main_test {
    @Test
    void is_removal_working() {
        //given
        main34.name = "John Smith";
        roster[0] = "John Smith";
        roster[1] = "Jackie Johnson";
        roster[2] = "Chris Jones";
        roster[3] = "Amanda Cullen";
        roster[4] = "Jeremy Goodwin";

        //when
        main34.removal();

        String expect = "";
        String actual = roster[0];

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_removal_working2() {
        //given
        main34.name = "Amanda Cullen";
        roster[0] = "John Smith";
        roster[1] = "Jackie Johnson";
        roster[2] = "Chris Jones";
        roster[3] = "Amanda Cullen";
        roster[4] = "Jeremy Goodwin";

        //when
        main34.removal();

        String expect = "";
        String actual = roster[3];

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_removal_working3() {
        //given
        main34.name = "Rey Fundora";
        roster[0] = "John Smith";
        roster[1] = "Jackie Johnson";
        roster[2] = "Chris Jones";
        roster[3] = "Amanda Cullen";
        roster[4] = "Jeremy Goodwin";

        //when
        main34.removal();

        String expect = "John Smith";
        String actual = roster[0];

        //then
        assertEquals(expect, actual);
    }
}
