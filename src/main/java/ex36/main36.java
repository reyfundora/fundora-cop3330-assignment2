package ex36;

import java.util.Scanner;

public class main36 {
    static double[] list = new double[1000];
    static double num;
    static String output;

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        while(true) {
            System.out.print("Enter a number: ");
            String num_in = input.nextLine();

            if (num_in.equals("done")) { System.out.println(list[counter]); break; }
            else {
                try {
                    num = Double.parseDouble(num_in);
                    list[counter] = num;
                    counter++;

                }
                catch (Exception e) { System.out.println("Please only enter numerical values. Try again."); }
            }
        }
    }
}
