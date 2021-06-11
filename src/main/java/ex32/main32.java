package ex32;

import java.util.Scanner;

public class main32 {

    public static void main (String[] args) {

        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Let's play Guess the Number!\n" +
                    "Enter the difficulty level (1, 2, or 3): ");
            String level = input.next();

            try {
                int level_num = Integer.parseInt(level);
                if (level_num == 1) Difficulty.level_one();
                if (level_num == 2) Difficulty.level_two();
                if (level_num == 3) Difficulty.level_three();
                if (level_num > 3) throw new Exception();
                break;
            }

            catch (Exception e) {
                System.out.println("Invalid input. For difficulty, only enter 1, 2, or 3. Try again.\n");
            }
        }
    }
}