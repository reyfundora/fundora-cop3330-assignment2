package ex33;

import java.util.Scanner;

public class main33 {
    static String output;

    static void array_method() {
        int min = 0, max = 3;
        int random_num = (int)Math.floor(Math.random() * (max - min + 1) + min);

        String[] answer = new String[4];
        answer[0] = "Yes.";
        answer[1] = "No.";
        answer[2] = "Maybe.";
        answer[3] = "Ask again later.";

        output = answer[random_num];
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your questio n? ");
        String question = input.nextLine();

        array_method();
        System.out.println(output);
    }
}
