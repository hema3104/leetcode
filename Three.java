public class Three {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), longest = 0;
        int[] nextIndex = new int[128];

        for (int r = 0, l = 0; r < n; r++) {
            l = Math.max(nextIndex[s.charAt(r)], l);
            longest = Math.max(longest, r - l + 1);
            nextIndex[s.charAt(r)] = r + 1;
        }

        return longest;
    }

    public static void main(String[] args) {
        // Test the lengthOfLongestSubstring method
        Three solution = new Three();

        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";

        System.out.println("Longest substring length for '" + test1 + "': " + solution.lengthOfLongestSubstring(test1)); // Expected: 3
        System.out.println("Longest substring length for '" + test2 + "': " + solution.lengthOfLongestSubstring(test2)); // Expected: 1
        System.out.println("Longest substring length for '" + test3 + "': " + solution.lengthOfLongestSubstring(test3)); // Expected: 3
    }
}
