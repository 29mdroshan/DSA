package _1_ArrayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A6_SmallerNumbersThanCurrent {
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(temp[i])) {
                map.put(temp[i], i);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }

    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] count=new int[101];
        for(int num:nums)
            count[num]++;

        int[] lessThan=new int[101];
        for(int i=1;i<101;i++){
            lessThan[i]=count[i-1]+lessThan[i-1];
        }

        for(int i=0;i<nums.length;i++)
            nums[i]=lessThan[nums[i]];

        return nums;
    }
}
