package _6_Backtracing;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public List<List<Integer>> allPermutation() {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), new int[]{1,2,3});
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> curr, int[] nums) {
        if(curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            backtrack(result, curr, nums);
            curr.remove(curr.size() -1);

        }
    }
}
