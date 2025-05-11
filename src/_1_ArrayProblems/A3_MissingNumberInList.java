package _1_ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A3_MissingNumberInList {
//    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

    public List<Integer> missingNumber1(int[] num) {
        // MyApproach
        Set<Integer> set = Arrays.stream(num).boxed().collect(Collectors.toSet());
        List<Integer> result =  new ArrayList<>();
        int n = num.length;
        for(int i = 0; i <= n; i++) {
            if(!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> missingNumber2(int[] nums) {
        // marking the presence in array
//        if you have array [3,1,4,1] for 3, i will go to index 2 and make its value negative ie. now nums[2] becomes -4. present array: [3,1,-4,1]
//        for 1, i will go to index 0 and make its value negative ie. now nums[0] becomes -3. present array: [-3,1,-4,1]
//        for 4, (take abs value), i will go to index 3 and make its value negative ie. now nums[3] becomes -1. present array: [-3,1,-4,-1]
//        for 1 take abs value), i will go to index 0 as it is already -ve do nothing. present array: [-3,1,-4,-1]
//        At last I will have [-3,1,-4,-1]. now i will iterate over the array, whichever idx has positive value that number will not be in the array so as we have nums[1]>0 so 2 is not in the list.
        for(int i : nums) {
            int idx = Math.abs(i);
            if(nums[idx -1] > 0) {
                nums[idx -1] *= -1;
            }
        }

        List<Integer> result =  new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }
}
