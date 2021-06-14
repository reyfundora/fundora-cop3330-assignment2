/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex39;

import static ex39.HashMaps.*;
public class main39 {

    static void output() {
            String row1 = "Name                | Position          | Separation Date\n",
                   row2 = "--------------------|-------------------|----------------\n";
            System.out.print(row1 + row2);

        for (int i = 0; i < 6; i++) {
            System.out.print(maplist.get(i).get(1));
            System.out.print(maplist.get(i).get(2));
            System.out.print(maplist.get(i).get(3));
        }
    }

    public static void main (String[] args) {
        HashMaps.map_assign();
        output();
    }
}
