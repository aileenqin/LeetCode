public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        int[] f = new int[amount + 1]; //state
        f[0] = 0;
        for (int i = 1; i <= amount; i++) {
            f[i] = Integer.MAX_VALUE;
        }
        
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i + coin <= amount) {
                    if (f[i] != Integer.MAX_VALUE) {
                        f[i + coin] = Math.min(f[i + coin], f[i] + 1);
                    }
                }
            }
        }
        if (f[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        
        return f[amount];
    }
}

