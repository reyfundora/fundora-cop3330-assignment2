
package ex24;

public class ex24_main {
    public static void main (String[] args) {
            Anagram.user_input();
        while (Anagram.isAnagram()) {
            Anagram.user_input();
            Anagram.isAnagram();
        }
    }
}
