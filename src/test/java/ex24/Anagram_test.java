package ex24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Anagram_test {
    @Test
    public void is_Anagram_Pass1() {
        // given
        Anagram.first = "tone";
        Anagram.second = "note";
        Anagram.isAnagram();

        // when
        String actual = Anagram.output;
        String expectation = "\"tone\" and \"note\" are anagrams.";

        // then
        assertEquals(expectation, actual);
    }
    @Test
    public void is_Anagram_Fail2() {
        // given
        Anagram.first = "tone";
        Anagram.second = "code";
        Anagram.isAnagram();

        // when
        String actual = Anagram.output;
        String expectation = "The two words are not anagrams.";

        // then
        assertEquals(expectation, actual);
    }
    @Test
    public void is_Anagram_Fail1() {
        // given
        Anagram.first = "cone";
        Anagram.second = "code";
        Anagram.isAnagram();

        // when
        String actual = Anagram.output;
        String expectation = "The two words are not anagrams.";

        // then
        assertEquals(expectation, actual);
    }
}
