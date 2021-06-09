package ex25;

import static ex25.ex25_main.password;

public class Password {
    static boolean very_weak() {
        boolean only_num = false;
        int length = password.length();

        try {

        }
        catch (Exception e) {
            only_num = false;
        }

        return length < 8 && only_num;
    }

    static boolean weak() {
        return false;
    }

    static boolean strong() {
        return false;
    }

    static boolean very_strong() {
        return false;
    }
}
