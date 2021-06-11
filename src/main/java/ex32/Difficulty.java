package ex32;

import static ex32.main32.level_num;

public class Difficulty {
    static void start_game() {
        int min = 0, max = 0;
        if (level_num == 1) { min = 1; max = 10; }
        if (level_num == 2) { min = 1; max = 100; }
        if (level_num == 3) { min = 1; max = 1000; }
        int random_num = (int)Math.floor(Math.random() * (max - min + 1) + min);



    }


}
