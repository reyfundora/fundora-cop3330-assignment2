package ex37;

import java.util.Scanner;

public class main37 {
    static int min_length, spl_length, num_length;

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

                min_length = Integer.parseInt(length_in);
                spl_length = Integer.parseInt(special_in);
                num_length = Integer.parseInt(num_in);

       /*         if (total_length < spl_length + num_length) {
                    System.out.println("""
                            
                            INVALID INPUT
                            At least half of the password has to be letters.
                            Make sure the requested amount of numbers and special characters
                            does not exceed half of the total required length. Try again.
                            """); continue;
                }*/

                Password.generate();
                System.out.println("\n");
                break;
            }
            catch (Exception e) {
                System.out.println("""
                        
                        INVALID INPUT
                        Only enter whole numbers when prompted. Try again.
                        """);
            }
        }
    }
}
