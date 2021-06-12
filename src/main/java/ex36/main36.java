package ex36;

import java.util.Scanner;

public class main36 {
    static double[] list = new double[1000];
    static double num;
    static int counter = 0;
    static String output;

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number: ");
            String user_input = input.nextLine();

            try {
                if (!user_input.equals("done")) {
                    num = Double.parseDouble(user_input);
                    list[counter] = num;
                    counter++;
                }
                else {
                    Calculator.output_method();
                    System.out.println(output);
                    break;
                }
            }
            catch (Exception e) { System.out.println("Please only enter numerical values. Try again.\n"); }
        }
    }
}
