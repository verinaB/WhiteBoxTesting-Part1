package example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
public class CharacterCounterTest {

        @Test
        public void testNodeCoverage() {
            char[] charArray = {'a', 'a', 'c', 'b'};
            char target = 'a';
            assertEquals(2, CharacterCounter.countOccurrences(charArray, target));
        }

        @Test
        public void testEdgeCoverage() {
            char[] charArray = {'a', 'b', 'c', 'a'};
            char target = 'a';
            assertEquals(2, CharacterCounter.countOccurrences(charArray, target));
        }

        @Test
        public void testEdgePairCoverage() {
            char[] charArray = {'a', 'b', 'a', 'c', 'a'};
            char target = 'a';
            assertEquals(3, CharacterCounter.countOccurrences(charArray, target));
        }
    @Test
    public void testMultipleOccurrences() {
        char[] charArray = {'a', 'b', 'a', 'c', 'a'};
        char target = 'a';
        assertEquals(3, CharacterCounter.countOccurrences(charArray, target));
    }
    @Test
    public void testSingleElementArray() {
        char[] charArray = {'a'};
        char target = 'a';
        assertEquals(1, CharacterCounter.countOccurrences(charArray, target));
    }
    @Test
    public void testTargetNotFound() {
        char[] charArray = {'b', 'c', 'd'};
        char target = 'a';
        assertEquals(0, CharacterCounter.countOccurrences(charArray, target));
    }
    @Test
    public void testEmptyArray() {
        char[] charArray = {};
        char target = 'a';
        assertEquals(0, CharacterCounter.countOccurrences(charArray, target));
    }
}



