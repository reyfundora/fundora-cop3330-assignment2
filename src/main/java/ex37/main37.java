package ex37;

import java.util.Scanner;

public class main37 {
    static int length, special, num;
    static String output;

    static void generate() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("What's the minimum length? ");
                String length_in = input.next();
                System.out.print("How many special characters? ");
                String special_in = input.next();
                System.out.print("How many numbers? ");
                String num_in = input.next();

                length = Integer.parseInt(length_in);
                special = Integer.parseInt(special_in);
                num = Integer.parseInt(num_in);

                generate();
                System.out.println(output);

                break;
            }
            catch (Exception e) {
                System.out.println("Invalid input. Only enter numbers when prompted. Try again.\n");
            }
        }
    }
}

