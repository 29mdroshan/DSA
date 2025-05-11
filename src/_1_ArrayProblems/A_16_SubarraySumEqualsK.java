package _1_ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class A_16_SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, result = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int key = sum - k;
            if(map.containsKey(key)) {
                result += map.get(key);
            }
            map.put(sum,  map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }

    public static void main(String args[]) {
        A_16_SubarraySumEqualsK a = new A_16_SubarraySumEqualsK();
        int[] nums = {3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};
        a.subarraySum(nums, 5);
    }
}
