package ex30;

import java.util.ArrayList;
import java.util.Arrays;

public class main30 {
    static String output;

    static void math(){
        int[] a = new int[12];
        int[] b = new int[12];

        for (int i = 1; i <= 12; i++)
            for (int j = 1; j <= 12; j++) {
                a[i - 1] = i;
                b[j - 1] = j;

                String row1 = a[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                            + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row2 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row3 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row4 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row5 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row6 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row7 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row8 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row9 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row10 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row11 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                String row12 = b[0] + "%4s" + a[1] + "%4s" + a[2] + "%4s" + a[3] + "%4s" + a[4] + "%4s" + a[5] + "%4s"
                        + a[6] + "%4s" + a[7] + "%4s" + a[8] + "%4s" + a[9] + "%4s" + a[10] + "%4s" + a[11] + "%4s";

                output =  row1 + "\n" + row2 + "\n" + row3 + "\n" + row4 + "\n" + row5 + "\n" + row6 + "\n" +
                          row7 + "\n" + row8 + "\n" + row9 + "\n" + row10 + "\n" + row11 + "\n" + row12;
            }
    }

    public static void main (String[] args) {
        math();
        System.out.println(output);
    }
}
