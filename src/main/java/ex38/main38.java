package ex38;

import java.util.Scanner;

public class main38 {
    static String numbers_in;
    static String[] numbers_in_array = new String[1000];
    static double[] numbers = new double[1000];
    static double[] numbers_even = new double[1000];

    static int counter = 0, even_counter = 0;

    static void filterEvenNumbers() {
        numbers_in_array = numbers_in.split(" ");

        for (int i = 0; i < numbers_in.length(); i++)
            if (Character.isWhitespace(numbers_in.charAt(i))) counter++;

        for (int i = 0; i < numbers_in_array.length; i++)
            numbers[i] = Double.parseDouble(numbers_in_array[i]);

        for (int i = 0; i < counter + 1; i ++) {
            if (numbers[i] % 2 == 0) {
                even_counter++;
                numbers_even[even_counter] = numbers[i];
            }
        }
    }

    static void output() {
        System.out.print("The even numbers are");
        for (int i = 0; i < even_counter + 1; i ++) {
            System.out.print(" " + numbers_even[i]);
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        numbers_in = input.nextLine();

        filterEvenNumbers();
        output();
    }
}
