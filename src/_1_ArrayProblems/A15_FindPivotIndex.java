package _1_ArrayProblems;

//https://leetcode.com/problems/find-pivot-index/
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11
public class A15_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] rightSum = new int[nums.length];
        rightSum[nums.length -1] = 0;

        for(int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        int leftSum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(leftSum == rightSum[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }
}
