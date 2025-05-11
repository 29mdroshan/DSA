package _6_Backtracing;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithOneOp {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), arr, 0, 0, target);
        return  result;
    }

    private boolean backtrack(List<List<Integer>> result, List<Integer> temp, int[] arr, int start, int sum, int target) {
        if(start == arr.length) {
            if(sum == target) {
                result.add(new ArrayList<>(temp));
                return true;
            }
            return false;
        }
        temp.add(arr[start]);
        sum += arr[start];
        if(backtrack(result, temp, arr, start+1, sum, target) == true) return true;
        temp.remove(temp.size() -1);
        sum -= arr[start];
        if(backtrack(result, temp, arr, start +1, sum, target)) return true;
        return false;
    }
}
