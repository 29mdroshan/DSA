package _1_ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class A5_ReplaceElementsInArray {

    // https://leetcode.com/problems/replace-elements-in-an-array/

    // int[] nums = {1,2,4,6};
    // int[][] ops = {{1,3},{4,7},{6,1}};

    public int[] arrayChange(int[] nums, int[][] operations) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for(int[] ops: operations) {
            nums[map.get(ops[0])] = ops[1];
            map.put(ops[1], map.get(ops[0]));
            map.remove(ops[0]);
        }
        return nums;
    }
}
