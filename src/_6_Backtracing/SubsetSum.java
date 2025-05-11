package _6_Backtracing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetSum {
    public List<Integer> subsetSum() {
        List<Integer> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), new int[]{3,2,1}, 0,0);
        return result.stream().sorted().collect(Collectors.toList());
    }

    private void backtrack(List<Integer> result, List<Integer> temp, int[] nums, int sum,int start) {
        result.add(sum);
        for(int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            sum += nums[i];
            backtrack(result, temp, nums, sum, i+1);
            temp.remove(temp.size() -1);
            sum -= nums[i];
        }
    }
}
