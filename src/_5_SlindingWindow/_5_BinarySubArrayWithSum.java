package _5_SlindingWindow;

public class _5_BinarySubArrayWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subFun(nums, goal) - subFun(nums, goal -1);
    }

    public int subFun(int[] nums, int goal) {
        int l = 0, r = 0, sum = 0, count = 0;
        if(goal < 0) return 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count += (r-l +1);
            r++;
        }
        return count;
    }
}
