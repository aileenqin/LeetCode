public class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start + 1 < end && nums[start] >= nums[end]) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[start]) {
                end = mid;
            }
            else if (nums[mid] == nums[start]) {
                start += 1;   //indicate duplicates
            } else
                start = mid;
        }
        if (nums[start] < nums[end]) {
            return nums[start];
        } else
            return nums[end];
    }
}
