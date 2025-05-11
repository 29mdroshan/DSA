package _1_ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class A1_DuplicateInteger {
    // leetcode : https://leetcode.com/problems/contains-duplicate/description/
    public boolean myApproach(int[] nums) {
        // This is optimal solution
        Set<Integer> distint = new HashSet<>();
        for(int num : nums) {
            if(distint.contains(num)) {
                return false;
            }
            distint.add(num);
        }
        return true;
    }
}
