/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex37;

import java.util.ArrayList;
import java.util.List;

import static ex37.main37.min_length;
import static ex37.main37.num_length;
import static ex37.main37.spl_length;

public class Password {
    static void generate() {
        List<String> abc_list = new ArrayList<String>();
        List<String> num_list = new ArrayList<String>();
        List<String> spl_list = new ArrayList<String>();
        List<String> pass_list = new ArrayList<String>();

        for (char i = 'a'; i <= 'z'; i++) {
            String j = String.valueOf(i);
            abc_list.add(j);
        }
        for (int i = 0; i < 10; i++) {
            String j = String.valueOf(i);
            num_list.add(j);
        }
        for (char i = '!'; i <= '+'; i++) {
            String j = String.valueOf(i);
            spl_list.add(j);
        }
        spl_list.add("="); spl_list.add("]"); spl_list.add("["); spl_list.add(";"); spl_list.add(":");
        spl_list.add("<"); spl_list.add(">"); spl_list.add("?"); spl_list.add("~"); spl_list.add(".");
        spl_list.remove("\"");

        int abc_max = 25, abc_min = 0, num_max = 9, num_min= 0, spl_max = 19, spl_min= 0;

        while (min_length - (num_length + spl_length) <= num_length + spl_length) {
            int random_abc = (int) Math.floor(Math.random() * (abc_max - abc_min + 1) + abc_min);
            pass_list.add(abc_list.get(random_abc));
            min_length++;
        }

        for (int i = 0; i < min_length - (num_length + spl_length); i++) {
            int random_abc = (int) Math.floor(Math.random() * (abc_max - abc_min + 1) + abc_min);
            pass_list.add(abc_list.get(random_abc));
        }

        for (int i = 0; i < num_length; i++) {
            int random_num = (int) Math.floor(Math.random() * (num_max - num_min + 1) + num_min);
            pass_list.add(num_list.get(random_num));
        }
        for (int i = 0; i < spl_length; i++) {
            int random_spl = (int) Math.floor(Math.random() * (spl_max - spl_min + 1) + spl_min);
            pass_list.add(spl_list.get(random_spl));
        }

        System.out.print("Your password is ");

        int counter = pass_list.size();
        int total_max = pass_list.size() - 1, total_min = 0;

        for (int i = 0; i < counter; i++) {
            int random = (int) Math.floor(Math.random() * (total_max - total_min + 1) + total_min);
            System.out.print(pass_list.get(random));
            pass_list.remove(random);
            total_max = total_max - 1;
        }
    }
}
