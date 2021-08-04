// Problem 1: Given two Strings A and B. 
// Find the length of the Longest Common Subsequence 
// (LCS) of the given Strings. Input: A = Minneapolis, 
// B = Minnesota.
/**
 * Problem1
 */
public class Problem1 {

    public static void main(String[] args) {
        System.out.println(lcs("Minneapolis", "Minnesota"));
    }

    public static String lcs(String a, String b) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        int start = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = start; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    start = j + 1;
                    count++;
                    sb.append(a.charAt(i));
                }
            }
        }
        return String.format("Length: %s\nOutput: %s",
                count, sb.toString());
    }
}