// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.
// Example 1:
// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true.
public class arrayStringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = new String[] { "ab", "c" };
        String[] word2 = new String[] { "abc" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (String.join("", word1).equals(String.join("", word2))) {
            return true;
        }
        return false;
    }
}
