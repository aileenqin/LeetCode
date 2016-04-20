public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        int prev = 0;
        boolean[] test = new boolean[256];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!test[s.charAt(i)]){
                test[s.charAt(i)] = true;
            }
            else {
                while (s.charAt(prev) != s.charAt(i)) {
                    test[s.charAt(prev)] = false;
                    prev++;
                }
                prev++;
            }
            max = Math.max(max, i - prev + 1);
        }
        return max;
    }
}
