package _6_Backtracing;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumAlternative {
    // works only for continuous sub array

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), arr, 0, 0, target);
        return  result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] arr, int start, int sum, int target) {
        if(start == arr.length) {
            if(sum == target) {
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(arr[start]);
        sum += arr[start];
        backtrack(result, temp, arr, start+1, sum, target);
        temp.remove(temp.size() -1);
        sum -= arr[start];
        backtrack(result, temp, arr, start +1, sum, target);
    }
}
