public class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > nums[start]) {
                if (nums[mid] >= target && target >= nums[start]) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            else if (nums[mid] < nums[start]) {  
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid;
                } else
                    end = mid;
            }
            else {
                start += 1;
            }
        }
        if (nums[start] == target || nums[end] == target) {
            return true;
        } else
            return false;
    }
}
