package backtracing;

import java.util.ArrayList;
import java.util.List;

public class AllSubSetAlternative {

    public List<List<Integer>> allSubsets() {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), new int[]{3,2,1}, 0);
        return  result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] arr, int start) {
        if(start == arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[start]);
        backtrack(result, temp, arr, start+1);
        temp.remove(temp.size() -1);
        backtrack(result, temp, arr, start +1);
    }
}
