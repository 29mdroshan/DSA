package _1_ArrayProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A2_MissingNumber {
    // https://leetcode.com/problems/missing-number/description/
    public int missingNumber1(int[] num) {
        // MyApproach
         List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
         int n = num.length;
         for(int i = 0; i <= n; i++) {
             if(!list.contains(i)) {
                 return i;
             }
         }
         return -1;
    }

    public int missingNumber2(int[] num) {
        // using index
        int n =  num.length;
        int res =  n;
        for(int i = 0 ; i < n; i++) {
            res += i - num[i];
        }
        return res;
    }

    public int missingNumber3(int[] num) {
        // using xor
        int n =  num.length;
        int res =  n;
        for(int i = 0 ; i < n; i++) {
            res ^= num[i];
            res ^= i;
        }
        return res;
    }
}
