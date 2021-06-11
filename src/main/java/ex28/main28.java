package ex28;

import java.util.Scanner;

public class main28 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double[] user_input = new double[5];
        double output = 0;

        // Input_Loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            String for_in = input.next();

            try {
                double for_num = Double.parseDouble(for_in);
                 user_input[i] = for_num;
            }
            catch (Exception e) {
                System.out.println("\nPlease make sure you are only inputting numbers. Try again.\n");
                i--;
            }
        }

        // Output_Loop
        for (int i = 0; i < 5; i++) {
            output = output + user_input[i];
        }

        System.out.println("The total is " + output);
    }
}
