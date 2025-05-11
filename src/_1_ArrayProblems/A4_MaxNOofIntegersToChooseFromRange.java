package _1_ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class A4_MaxNOofIntegersToChooseFromRange {
//    https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/

//    int[]  nums= {1,6,5};
//    maxCount(nums, 5 , 6);

    public int maxCount(int[] banned, int n, int maxSum) {
//        Set<Integer> set = Arrays.stream(banned).boxed().filter(i-> i <= n).collect(Collectors.toSet());

        Set<Integer> set = new HashSet<>();
        for(int i : banned) {
            if(i <= n) {
                set.add(i);
            }
        }
        int sum = 0, count = 0;
        for(int i = 1 ; i <= n; i++) {
            if(!set.contains(i)) {
                sum += i;
                if(sum <= maxSum) {
                    count++;
                }
            }
        }
        return count;

    }
}
