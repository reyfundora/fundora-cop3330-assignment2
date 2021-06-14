package ex40;

import ex40.HashMaps;
import org.junit.jupiter.api.Test;

import static ex40.HashMaps.maplist;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMaps_Test {
    @Test
    void is_map_getting_saved_to_list() {
        //given
        HashMaps.map_assign();

        //when
        String expect = "Jake Jacobson       |";
        String actual = (String) maplist.get(1).get(1);

        //then
        assertEquals(expect, actual);

    }
    @Test
    void is_map_getting_saved_to_list2() {
        //given
        HashMaps.map_assign();

        //when
        String expect = " District Manager  | ";
        String actual = (String) maplist.get(3).get(2);

        //then
        assertEquals(expect, actual);

    }
    @Test
    void is_map_getting_saved_to_list3() {
        //given
        HashMaps.map_assign();

        //when
        String expect = "2016-12-31\n";
        String actual = (String) maplist.get(2).get(3);

        //then
        assertEquals(expect, actual);
    }
}
