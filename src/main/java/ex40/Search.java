package ex40;

import java.util.Arrays;
import static ex40.HashMaps.*;
import static ex40.main40.search;

public class Search {

    static Integer[] counts = new Integer[6];
    static void Search_Function() {
        int Jackson= 0, Jacobson = 0, Johnson = 0, Michaelson = 0, Weber = 0, Xiong = 0;

        String[] names = new String[6];
        names[0] = "Jacquelyn" + "Jackson";
        names[1] = "Jake" + "Jacobson";
        names[2] = "John" + "Johnson";
        names[3] = "Michaela" + "Michaelson";
        names[4] = "Sally" + "Weber";
        names[5] = "Tou" + "Xiong";

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 0; i < 18; i++) {

            while (a < search.length() && i < names[0].length()) {
                if (search.charAt(a) == names[0].charAt(i)) {
                        Jackson++; a++;
                }
                break;
                }
            while (b < search.length() && i < names[1].length()) {
                if (search.charAt(b) == names[1].charAt(i)) {
                    Jacobson++; b++;
                }
                break;
            }
            while (c < search.length() && i < names[2].length()) {
                if (search.charAt(c) == names[2].charAt(i)) {
                    Johnson++; c++;
                }
                break;
            }
            while (d < search.length() && i < names[3].length()) {
                if (search.charAt(d) == names[3].charAt(i)) {
                    Michaelson++; d++;
                }
                break;
            }
            while (e < search.length() && i < names[4].length()) {
                if (search.charAt(e) == names[4].charAt(i)) {
                    Weber++; e++;
                }
                break;
            }
            while (f < search.length() && i < names[5].length()) {
                if (search.charAt(f) == names[5].charAt(i)) {
                    Xiong++; f++;
                }
                break;
            }

        }

        counts[0] = Jackson;
        counts[1] = Jacobson;
        counts[2] = Johnson;
        counts[3] = Michaelson;
        counts[4] = Weber;
        counts[5] = Xiong;

        String row1 = "Name                | Position          | Separation Date\n",
                row2 = "--------------------|-------------------|----------------\n";
        System.out.print(row1 + row2);

        for (int i = 0; i < 6; i++) {
            if (counts[i] == search.length()) {
                System.out.print(maplist.get(i).get(1));
                System.out.print(maplist.get(i).get(2));
                System.out.print(maplist.get(i).get(3));
            }
        }
    }
}