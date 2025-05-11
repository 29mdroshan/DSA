package _1_ArrayProblems;

//https://leetcode.com/problems/contiguous-array/description/
//Input: nums = [0,1,1,1,1,1,0,0,0]
//Output: 6
//Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.

import java.util.HashMap;
import java.util.Map;

public class A13_ContiguousArray {
    public int findMaxLength(int[] nums) {
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 0) {
                nums[i] = -1;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0 , maxsum = 0;
        for(int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                maxsum = Math.max(maxsum, i - map.get(sum));
            }
        }
        return maxsum;
    }
}
