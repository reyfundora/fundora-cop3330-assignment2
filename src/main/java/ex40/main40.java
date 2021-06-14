package ex40;

import java.util.Scanner;

import static ex40.HashMaps.maplist;

public class main40 {
    static String search;

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a search string: ");
        search = input.nextLine();

        HashMaps.map_assign();
        Search.Search_Function();
    }
}
