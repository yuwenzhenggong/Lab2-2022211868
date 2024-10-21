import org.example.Solution7;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class L2022211868_7_Test {

    @Test
    public void testSmallestStringWithSwaps1() {
        Solution7 solution = new Solution7();
        String s1 = "dcab";
        List<List<Integer>> pairs1 = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        );
        String result1 = solution.smallestStringWithSwaps(s1, pairs1);
        assertEquals("bacd", result1);
    }

    @Test
    public void testSmallestStringWithSwaps2() {
        Solution7 solution = new Solution7();
        String s2 = "dcab";
        List<List<Integer>> pairs2 = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2),
                Arrays.asList(0, 2)
        );
        String result2 = solution.smallestStringWithSwaps(s2, pairs2);
        assertEquals("abcd", result2);
    }

    @Test
    public void testSmallestStringWithSwaps3() {
        Solution7 solution = new Solution7();
        String s3 = "cba";
        List<List<Integer>> pairs3 = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2)
        );
        String result3 = solution.smallestStringWithSwaps(s3, pairs3);
        assertEquals("abc", result3);
    }
}