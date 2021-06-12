package ex38;

import java.util.Scanner;

public class main38 {

    static void filterEvenNumbers() {

    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int[] numbers = new int[1000];

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers_in = input.nextLine();

        for (int i = 0; i <numbers_in.length(); i++) {
            if(Character.isWhitespace(numbers_in.charAt(i))) counter++;
        }

        for (int i = 0; i < counter; i ++) {
            numbers[i] = numbers_in.charAt(i);
        }
    }
}
