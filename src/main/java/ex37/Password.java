package ex37;

import java.util.ArrayList;
import java.util.List;

public class Password {
    static void generate() {
        List<String> num_list = new ArrayList<String>();
        List<String> abc_list = new ArrayList<String>();
        List<String> spl_list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String j = String.valueOf(i);
            num_list.add(j);
        }
        for (char i = 'a'; i <= 'z'; i++) {
            String j = String.valueOf(i);
            abc_list.add(j);
        }

        for (char i = '!'; i <= '+'; i++) {
            String j = String.valueOf(i);
            spl_list.add(j);
        }
        spl_list.add("="); spl_list.add("]"); spl_list.add("["); spl_list.add(";"); spl_list.add(":");
        spl_list.add("<"); spl_list.add(">"); spl_list.add("?"); spl_list.add("~"); spl_list.add(".");
        spl_list.remove("\"");


    }
}
