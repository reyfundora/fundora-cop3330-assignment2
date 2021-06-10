package ex27;

import static ex27.main27.first_name;

public class Validation {
    static String output, error1, error2, error3, error4;

    static boolean first_name() {
        int length = first_name.length();
        int no_num = 0;

        if (length >= 2){
            for (int i = 0; i < length; i++) {
                if (Character.isLetter(first_name.charAt(i))) no_num++;
                if (no_num == length) return true;
            }
            if (no_num != length) error1 = "Please only input names without numbers.\n";
        }
        if (length < 2) error1 = "The first name must be at least 2 characters long.\n";
        return false;
    }

    static boolean last_name() {
        int length = main27.last_name.length();
    }

    static boolean zip_code() {

    }

    static boolean ID_num() {

    }

    static void validateInput(){
        if (first_name() && last_name() && zip_code() && ID_num())
            output = "There were no errors found.";
        else output = error1 + error2 + error3 + error4;
    }
}
