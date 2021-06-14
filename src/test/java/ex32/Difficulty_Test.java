/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex32;

import org.junit.jupiter.api.Test;

import static ex32.main32.level_num;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Difficulty_Test {
    @Test
    void is_Level_Difficulty_Working_Max() {
        //given
        main32.level_num = 1;
        int count = 1, min = 0, max = 0;
        if (level_num == 1) { min = 1; max = 10; }
        if (level_num == 2) { min = 1; max = 100; }
        if (level_num == 3) { min = 1; max = 1000; }

        //when
        int actual = max;
        int expect = 10;

        //then
        assertEquals(expect, actual);
    }
}
