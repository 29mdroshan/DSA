package _4_SlindingWindow;

public class _2_MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int l =0, r=0, maxLen =0, count =0;

        while(r < nums.length) {
            if(nums[r] == 0) count++;
            while(count > k) {
                if(nums[l] == 0) count--;
                l++;
            }
            if(count <= k) {
                maxLen = Integer.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
