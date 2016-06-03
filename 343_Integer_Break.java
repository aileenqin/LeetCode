public class Solution {
    public int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        }
        int[] f = new int[n + 1];
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; 2 * j <= i; j++) {
                f[i] = Math.max(f[i], (Math.max(j, f[j])) * (Math.max(i - j, f[i - j])));
            }
        }
        return f[n];
    }
}