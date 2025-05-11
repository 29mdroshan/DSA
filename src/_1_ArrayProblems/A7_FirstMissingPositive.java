package _1_ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class A7_FirstMissingPositive {
    // https://leetcode.com/problems/first-missing-positive/description/
    // Input: nums = [3,4,-1,1]
    //Output: 2
    //Explanation: 1 is in the array but 2 is missing.

    public int firstMissingPositive1(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i ++) {
            if(nums[i] < 0) {
                nums[i] = 0;
            }
        }

        for(int i = 0; i < n; i++) {
            int idx = Math.abs(nums[i]);
            if(Math.abs(nums[i]) >= 1 && Math.abs(nums[i]) <= n) {
                if(nums[idx -1] > 0) {
                    nums[idx-1] *= -1;
                } else if(nums[idx -1] == 0) {
                    nums[idx-1] = - (n+1);
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            if(nums[i-1] >= 0) {
                return i;
            }
        }
        return n+1;
    }

    public int firstMissingPositive(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for(int i : nums) {
             set.add(i);
         }
         int n = nums.length;
         for(int i = 1; i <= n; i++) {
             if(!set.contains(i)) {
                 return i;
             }
         }
         return n +1;
    }

}
