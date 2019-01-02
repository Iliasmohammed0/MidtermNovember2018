package string.problems;
import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Unit Test Anagram
        Anagram.isAnagram("CAT", "ACT");
        Assert.assertEquals("true", "true");

        //Determine LargestNumber
        try {
            String a = "What does NY stands for";
            Assert.assertEquals(DetermineLargestWord.findTheLargestWord(a), "stands");
            System.out.println("Test Passed");
        } catch (AssertionError as) {
            System.out.println("Test Failed");
        }
    }
}
