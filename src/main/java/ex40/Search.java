package ex40;

import java.util.Arrays;
import static ex40.HashMaps.*;
import static ex40.main40.search;

public class Search {
    static int Jackson, Jacobson, Johnson, Michaelson, Weber, Xiong;
    static void Search_Function() {

        String[] names = new String[6];
        names [0] = "Jacquelyn" + "Jackson";
        names [1] = "Jake" + "Jacobson";
        names [2] = "John" + "Johnson";
        names [3] = "Michaela" + "Michaelson";
        names [4] = "Sally" + "Weber";
        names [5] = "Tou" + "Xiong";

        for (int i = 0; i < search.length(); i++) {
            if (search.charAt(i) == names[0].charAt(i)) Jackson++;
            if (search.charAt(i) == names[1].charAt(i)) Jacobson++;
            if (search.charAt(i) == names[2].charAt(i)) Johnson++;
            if (search.charAt(i) == names[3].charAt(i)) Michaelson++;
            if (search.charAt(i) == names[4].charAt(i)) Weber++;
            if (search.charAt(i) == names[5].charAt(i)) Xiong++;
        }

        Integer[] counts = new Integer[6];
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