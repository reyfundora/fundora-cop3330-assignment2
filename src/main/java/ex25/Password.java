package ex25;

import static ex25.main25.pass_length;
import static ex25.main25.password;

public class Password {

    static boolean very_weak() {
        try {
            if (pass_length < 8) {
                double vw_test = Double.parseDouble(password);
                return true;
            }
        }
        catch (Exception e) {
            return false;
        }

        return false;
    }

    static boolean weak() {
        int char_test = 0;
        boolean char_test_check = false;

        if (pass_length < 8) {
            for (int i = 0; i < pass_length; i++)
                if (Character.isLetter(password.charAt(i))) char_test++;

                if (char_test == pass_length) char_test_check = true;
                else char_test_check = false;
        }

        return char_test_check;
    }

    static boolean average() {
        if (pass_length < 8 && !very_weak() && !weak()) return true;
        if (pass_length > 8 && !strong() && !very_strong()) return true;

        return false;
    }

    static boolean strong() {
        if (pass_length >= 8) {
            for (int i = 0; i < pass_length; i++)
                if (Character.isDigit(password.charAt(i))) return true;
        }

        return false;
    }

    static boolean very_strong() {
        int num_test = 0, char_test = 0, special_test = 0;

        if (pass_length >= 8) {
            for (int i = 0; i < pass_length; i++){
                if (Character.isLetter(password.charAt(i))) num_test++;
                if (Character.isDigit(password.charAt(i))) char_test++;
                if (!Character.isLetter(password.charAt(i)) &&
                    !Character.isDigit(password.charAt(i)) &&
                    !Character.isWhitespace(password.charAt(i))) special_test++;
            }
        }

        return num_test > 1 && char_test > 1 && special_test > 1;
    }

    static void passwordValidator() {
        if (very_weak()) main25.output = "The password '" + password + "' is a very weak password.";
        if (weak()) main25.output = "The password '" + password + "' is a weak password.";
        if (average()) main25.output = "The password '" + password + "' is an average password.";
        if (strong()) main25.output = "The password '" + password + "' is a strong password.";
        if (very_strong()) main25.output = "The password '" + password + "' is a very strong password.";
    }
}