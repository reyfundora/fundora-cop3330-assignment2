package ex40;

import org.junit.jupiter.api.Test;

import static ex40.HashMaps.maplist;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Search_Test {
    @Test
    void is_user_input_being_counted_in_function() {
        //given
        main40.search = "Jac";
        HashMaps.map_assign();
        Search.Search_Function();

        //when

        // This is counting that the word Jackson has three letters in common with the input "Jac"
        int expect = 3;
        int actual = Search.counts[0];

        //then
        assertEquals(expect, actual);

    }
    @Test
    void is_user_input_being_counted_in_function2() {
        //given
        main40.search = "Jac";
        HashMaps.map_assign();
        Search.Search_Function();

        //when

        // This is counting that the word Jacobson has three letters in common with the input "Jac"
        int expect = 3;
        int actual = Search.counts[1];

        //then
        assertEquals(expect, actual);

    }
}
