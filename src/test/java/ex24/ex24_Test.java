package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex24_Test {
    @Test
    void is_Anagram_return_true() {
       Anagram detector = new Anagram();

       boolean actual = detector.isAnagram();
       assertTrue(actual);

    }
}