package backtracing;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithCount {
    public int combinationSum(int[] arr, int target) {
       return backtrack(new ArrayList<>(), arr, 0, 0, target);
    }

    private int backtrack(List<Integer> temp, int[] arr, int start, int sum, int target) {
        if(start == arr.length) {
            if(sum == target) {;
                return 1;
            }
            return 0;
        }
        temp.add(arr[start]);
        sum += arr[start];
        int l = backtrack(temp, arr, start+1, sum, target);
        temp.remove(temp.size() -1);
        sum -= arr[start];
        int r = backtrack(temp, arr, start +1, sum, target);
        return l + r;
    }
}
