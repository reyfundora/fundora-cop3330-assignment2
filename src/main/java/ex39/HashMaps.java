/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex39;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {
    static ArrayList<HashMap> maplist = new ArrayList<>();
    static HashMap<Integer, String> Johnson = new HashMap<>();
    static HashMap<Integer, String> Xiong = new HashMap<>();
    static HashMap<Integer, String> Michaelson = new HashMap<>();
    static HashMap<Integer, String> Jacobson = new HashMap<>();
    static HashMap<Integer, String> Jackson = new HashMap<>();
    static HashMap<Integer, String> Webber = new HashMap<>();

    static void map_assign() {
        Johnson.put(1 , "John Johnson        |");
        Johnson.put(2, " Manager           | ");
        Johnson.put(3, "2016-12-31\n");

        Xiong.put(1, "Tou Xiong           |");
        Xiong.put(2, " Software Engineer | ");
        Xiong.put(3, "2016-10-05\n");

        Michaelson.put(1, "Michaela Michaelson |");
        Michaelson.put(2, " District Manager  | ");
        Michaelson.put(3, "2015-12-19\n");

        Jacobson.put(1, "Jake Jacobson       |");
        Jacobson.put(2, " Programmer        | ");
        Jacobson.put(3, "\n");

        Jackson.put(1, "Jacquelyn Jackson   |");
        Jackson.put(2, " DBA               | ");
        Jackson.put(3, "\n");

        Webber.put(1, "Sally Weber         |");
        Webber.put(2, " Web Developer     | ");
        Webber.put(3, "2015-12-18\n");

        maplist.add(Jackson); maplist.add(Jacobson); maplist.add(Johnson);
        maplist.add(Michaelson); maplist.add(Webber); maplist.add(Xiong);
    }
}
