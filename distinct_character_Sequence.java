import java.util.*;
public class distinct_character_Sequence {
    public class DistinctSubsequences {
        public static int countDistinctSubsequences(String s) {
            int n = s.length();
            int[] dp = new int[n + 1];
            dp[0] = 1; // Empty subsequence

            Map<Character, Integer> lastOccurrence = new HashMap<>();

            for (int i = 1; i <= n; i++) {
                char ch = s.charAt(i - 1);
                dp[i] = 2 * dp[i - 1];

                if (lastOccurrence.containsKey(ch)) {
                    dp[i] -= dp[lastOccurrence.get(ch) - 1];
                }

                lastOccurrence.put(ch, i);
                dp[i] = Math.max(dp[i], 0); // Ensure non-negative values
            }

            return dp[n] - 1; // Excluding the empty subsequence
        }

        public static void main(String[] args) {
            String s = "abcbac";
            System.out.println("Distinct subsequences count: " + countDistinctSubsequences(s));
        }
    }

}
