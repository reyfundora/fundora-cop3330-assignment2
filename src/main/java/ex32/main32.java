package ex32;

import java.util.Scanner;

public class main32 {
    static int level_num;
    public static void main (String[] args) {

        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Let's play Guess the Number!\n" +
                    "Enter the difficulty level (1, 2, or 3): ");
            String level = input.next();

            try {
                level_num = Integer.parseInt(level);
                if (0 < level_num && level_num < 3) Difficulty.start_game();
                else if (level_num > 3) throw new Exception();
                break;
            }

            catch (Exception e) {
                System.out.println("Invalid input. For difficulty, only enter 1, 2, or 3. Try again.\n");
            }
        }
    }
}