/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex31;

import org.junit.jupiter.api.Test;

import static ex31.main31.age;
import static ex31.main31.rate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Karvonen_Test {
    @Test
    void is_table_working() {
        //given
        main31.age = 22;
        main31.rate = 65;
        Karvonen.output_build();

        //when
        String actual = main31.output;
        String expect =
                """

                        Resting pulse: 65        Age: 22

                        Intensity    | Rate  \s
                        -------------|--------
                        55%          | 138 bpm
                        60%          | 145 bpm
                        65%          | 151 bpm
                        70%          | 158 bpm
                        75%          | 165 bpm
                        80%          | 171 bpm
                        85%          | 178 bpm
                        90%          | 185 bpm
                        95%          | 191 bpm
                        95%          | 191 bpm
                        """;

        //then
        assertEquals(expect, actual);
    }
    @Test
    void is_Equation_working() {
        //given
        main31.age = 22;
        main31.rate = 65;

        //when
        double actual  = (((220 - age) - rate) * (55 / 100)) + rate;
        double expect = 65; //Times 2 gives u the value that goes on table.

        //then
        assertEquals(expect, actual);
    }
}
