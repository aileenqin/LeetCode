public class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        if (x == 0 || x == 1) {
            return x;
        }
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (mid < x / mid) {
                start = mid;
            }
            else if (mid > x / mid) {
                end = mid;
            }
            else
                return mid;
        }
        if (end < x / end) {
            return end;
        }
        else {
            return start;
        }
    }
} 
