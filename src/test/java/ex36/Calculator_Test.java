/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator_Test {
    @Test
    void is_average_working() {
        //given
        main36.list[0] = 1;
        main36.list[1] = 2;
        main36.list[2] = 3;
        main36.list[3] = 4;
        main36.list[4] = 5;
        main36.counter = 5;

        //when
        Calculator.average();

        double expect = 3;
        double actual = Calculator.avg;

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_minimum_working() {
        //given
        main36.list[0] = 1;
        main36.list[1] = 2;
        main36.list[2] = 3;
        main36.list[3] = 4;
        main36.list[4] = 5;
        main36.counter = 5;

        //when
        Calculator.min();

        double expect = 1;
        double actual = Calculator.min;

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_maximum_working() {
        //given
        main36.list[0] = 1;
        main36.list[1] = 2;
        main36.list[2] = 3;
        main36.list[3] = 4;
        main36.list[4] = 5;
        main36.counter = 5;

        //when
        Calculator.max();

        double expect = 5;
        double actual = Calculator.max;

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_std_working() {
        //given
        main36.list[0] = 1;
        main36.list[1] = 2;
        main36.list[2] = 3;
        main36.list[3] = 4;
        main36.list[4] = 5;
        main36.counter = 5;
        Calculator.avg = 3;

        //when
        Calculator.std();

        double expect = 1.4142135623730951;
        double actual = Calculator.std;

        //then
        assertEquals(expect, actual);
    }
}
