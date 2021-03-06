public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid;
            }
            else if (nums[mid] > target) {
                end = mid;
            }
            else {
                return mid;
            }
        }
        if (nums[start] >= target) {
            return start;
        }
        else if (nums[end] >= target) {
            return end;
        }
        else
            return end + 1;
    }
}
