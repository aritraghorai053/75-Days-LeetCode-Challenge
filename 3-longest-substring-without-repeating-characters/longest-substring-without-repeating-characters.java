import java.util.Arrays;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int l = 0, maxLen = 0;

        for (int r = 0; r < n; r++) {

            if (hash[s.charAt(r)] >= l) {
                l = hash[s.charAt(r)] + 1;
            }

            hash[s.charAt(r)] = r;
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}