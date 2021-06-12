package ex36;

import java.text.DecimalFormat;

import static ex36.main36.*;

public class Calculator {
    static double avg, min, max, std;

    static void average() {
        double average_math = 0;

        for (int i = 0; i < counter; i++)
            average_math = average_math + list[i];
        avg = average_math / counter;
    }

    static void min() {
        min = list[0];

        for (int i = 0; i < counter; i++)
            if (min > list[i]) min = list[i];
    }

    static void max() {
        max = list[0];

        for (int i = 0; i < counter; i++)
            if (max < list[i]) max = list[i];
    }

    static void std() {
        double std_math = 0;

        for (int i = 0; i < counter; i++)
        std_math += Math.pow(list[i] - avg, 2) /counter;
        std = Math.sqrt(std_math);
    }

    static void output_method() {
        DecimalFormat df = new DecimalFormat("0.00");

        average(); max(); min(); std();
        output = "The average is " + avg + "\n" +
                 "The minimum is " + min + "\n" +
                 "The maximum is " + max + "\n" +
                 "The standard deviation is " + df.format(std);
    }
}
