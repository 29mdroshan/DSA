package backtracing;

import java.util.ArrayList;
import java.util.List;

public class AllSubSet {
    public List<List<Integer>> allSubset() {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), new int[]{1,2,3}, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> curr, int[] nums, int start) {
        result.add(new ArrayList<>(curr));

        for(int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(result, curr, nums, i + 1);
            curr.remove(curr.size() -1);
        }
    }
}
