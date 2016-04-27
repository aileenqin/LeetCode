public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] L = new int[nums.length];
        L[0] = 1;
        for(int i = 1; i < L.length; i++) {
            int max = 0;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i] && L[j] > max) {
                    max = L[j];
                }
            }
            L[i] = max + 1;
        }
        int count = 0;
        for(int i = 0; i < L.length; i++) {
            if(L[i] > count) {
                count = L[i];
            }
        }
        return count;
    }
}
