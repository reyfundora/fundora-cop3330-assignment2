package ex31;

import java.text.DecimalFormat;

import static ex31.main31.output;
import static ex31.main31.age;
import static ex31.main31.rate;

public class Karvonen {
    static void output_build() {
        double[] intensity = new double[9];
        double[] TargetHeartRate = new double[9];
        String[] data_print = new String[9];

        for (int i = 0; i < 9; i++){
            int j = 55 + (i * 5);
            intensity[i] = j;
            TargetHeartRate[i] = (((220 - age) - rate) * (intensity[i] / 100)) + rate;

            DecimalFormat df = new DecimalFormat("0");

            String row1 = "\nResting pulse: " + df.format(rate) + "        Age: " + df.format(age) + "\n\n";
            String row2 = "Intensity    | Rate   \n";
            String row3 = "-------------|--------\n";

            data_print[i] = df.format(intensity[i]) + "%          | " +
                            df.format(TargetHeartRate[i]) + " bpm\n";

            output = row1 + row2 + row3 + data_print[0] + data_print[1] + data_print[2]
                        + data_print[3] + data_print[4] + data_print[5] + data_print[6]
                        + data_print[7] + data_print[8] + data_print[8];
        }
    }
}
