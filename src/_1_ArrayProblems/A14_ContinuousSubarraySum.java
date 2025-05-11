package _1_ArrayProblems;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/continuous-subarray-sum/
//Input: nums = [23,2,4,6,7], k = 6
//Output: true
//Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.

public class A14_ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for(int i = 0 ;i < nums.length; i++) {
            sum += nums[i];
            int a = sum % k;
            if(!map.containsKey(a)) {
                map.put(a, i);
            } else {
                // we have a subarray from i - map.get(a);
                if(i - map.get(a) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
