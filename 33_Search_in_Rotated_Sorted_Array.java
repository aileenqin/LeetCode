public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > nums[start]) {
                if (nums[mid] >= target && target >= nums[start]) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            else {   //nums[mid] < nums[start], on second line
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid;
                } else
                    end = mid;
            }
        }			
        if (nums[start] == target) {
            return start;
        }
        else if (nums[end] == target) {
            return end;
        } else
            return -1;
    }
}
