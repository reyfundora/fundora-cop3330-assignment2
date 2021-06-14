/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex36;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ex36.Calculator.avg;
import static ex36.Calculator.min;
import static ex36.Calculator.max;
import static ex36.Calculator.std;

public class main_test {
    @Test
    void is_average_working() {
        //given
        avg = 3;
        min = 1;
        max = 5;
        std = 1.41;

        //when
        Calculator.output_method();

        DecimalFormat df = new DecimalFormat("0.00");
        String expect = "The average is " + avg + "\n" +
                "The minimum is " + min + "\n" +
                "The maximum is " + max + "\n" +
                "The standard deviation is " + df.format(std);;
        String actual = main36.output;

        //then
        assertEquals(expect, actual);
    }
}
