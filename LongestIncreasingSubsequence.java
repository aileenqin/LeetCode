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

//Key: let L(j) be the length of the maximum subsequence that ends at value j. 
//By definition, L(j)=L(i)+1 for some i<j, and A[i]<A[j], where A is the array. 
//So, L(j)=max(L(i) for all i<j)+1. 
//Loop from j=0 to j=A.length, and return the largest L(j) for the largest increasing subsequence.



/*
public int lengthOfLIS(int[] nums) {
    if (nums == null) {
        return 0;
    }
    
    List<Integer> seq = new ArrayList();
    for (int i = 0; i < nums.length; i++) {
        updateSequence(seq, nums[i]);
    }
    
    return seq.size();
}

private void updateSequence(List<Integer> seq, int elem) {
// 1 3 5 8  , 2 
    int start = 0, end = seq.size() - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (seq.get(mid) == elem) {
            return;
        } else if (seq.get(mid) < elem) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    if (start >= seq.size()) {
        seq.add(elem);
    } else {
        seq.set(start, elem);
    }
}
      
*/