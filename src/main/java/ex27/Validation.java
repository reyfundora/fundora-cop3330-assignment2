/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex27;

import java.util.Arrays;

import static ex27.main27.first_name;
import static ex27.main27.last_name;
import static ex27.main27.zip_in;
import static ex27.main27.ID_in;


public class Validation {
    static String output, error1 = "", error2 = "", error3 = "", error4 = "";

    static boolean first_name() {
        int first_length = first_name.length();
        int no_num = 0;

        if (first_length >= 2){
            for (int i = 0; i < first_length; i++) {
                if (Character.isLetter(first_name.charAt(i))) no_num++;
                if (no_num == first_length) return true;
            }
            error1 = "Please only input letters for first name.\n";
        }
        if (first_length < 2) {
            error1 = "The first name must be at least 2 characters long.\n";
            return false;
        }
        error1 = "Please only input letters for name.\n";
        return false;
    }

    static boolean last_name() {
        int second_length = main27.last_name.length();
        int no_num = 0;

        if (second_length >= 2){
            for (int i = 0; i < second_length; i++) {
                if (Character.isLetter(last_name.charAt(i))) no_num++;
                if (no_num == second_length) return true;
            }
            error2 = "Please only input letters for last name.\n";
        }
        if (second_length < 2) {
            error2 = "The last name must be at least 2 characters long.\n";
            return false;
        }
        error2 = "Please only input letters for name.\n";
        return false;
    }

    static boolean zip_code() {
        int third_length = zip_in.length();
        int no_char = 0;

        if (third_length == 5){
            for (int i = 0; i < third_length; i++) {
                if (Character.isDigit(zip_in.charAt(i))) no_char++;
                if (no_char == third_length) return true;
            }
            error3 = "Please only input numbers into your zip code.\n";
        }
        if (third_length != 5)
            error3 = "The zipcode must be a 5 digit number.\n";
            return false;
    }

    static boolean ID_num() {
        int fourth_length = ID_in.length();

        if (fourth_length == 7) {
            char[] ID_abc = ID_in.toCharArray();
            Arrays.sort(ID_abc);

            if (Character.isLetter(ID_abc[5]) && Character.isLetter(ID_abc[6]) &&
                    Character.isDigit(ID_abc[1]) && Character.isDigit(ID_abc[2]) &&
                    Character.isDigit(ID_abc[3]) && Character.isDigit(ID_abc[4]) &&
                    ID_abc[0] == '-') return true;
        }

        error4 = "The employee ID must be in the format of AA-1234.\n";
        return false;
    }

    static void validateInput(){
        first_name(); last_name(); zip_code(); ID_num();
        if (first_name() && last_name() && zip_code() && ID_num())
            output = "There were no errors found.";
        if (!first_name() || !last_name() || !zip_code() || !ID_num())
            output = error1 + error2 + error3 + error4;
    }
}
