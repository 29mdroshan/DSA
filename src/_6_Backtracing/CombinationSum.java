package _6_Backtracing;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    // works for repeating sub arr
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> curr,int[] nums, int remaining, int start) {
        if(remaining < 0) return;
        else if(remaining == 0) {
            result.add(new ArrayList<>(curr));
        }
        else {
            for(int i = start; i < nums.length; i++){
                curr.add(nums[i]);
                backtrack(result, curr, nums, remaining - nums[i], i);
                curr.remove(curr.size() -1);
            }
        }
    }
}
