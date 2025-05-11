package _2_TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _3_ThreeSum {
    // https://leetcode.com/problems/3sum/

    public List<List<Integer>> myApproach(int[] nums) {
        // Didn't work for large array
        int n = nums.length;
        List<List<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] res = {nums[i], nums[j], nums[k]};
                        Arrays.sort(res);
                        List<Integer> subList = new ArrayList<>();
                        for (int num : res) {
                            subList.add(num);
                        }
                        if (!mainList.contains(subList)) {
                            mainList.add(subList);
                        }

                    }
                }
            }
        }
        return mainList;
    }

    public List<List<Integer>> O_n2(int[] nums) {
        int n = nums.length;
        List<List<Integer>> mainList = new ArrayList<>();
        Set<Integer> numSet;
        for(int i =0; i < n ; i++) {
            numSet = new HashSet<>();
            for(int j = i+1; j<n ; j++) {
                int sum = -(nums[i] + nums[j]);
                if(numSet.contains(sum)) {
                    int[] res = {nums[i] ,nums[j] , sum};
                    Arrays.sort(res);
                    List<Integer> subList =  Arrays.stream(res).boxed().collect(Collectors.toList());
                    if(!mainList.contains(subList)) {
                        mainList.add(subList);
                    }
                } else{
                    numSet.add(nums[j]);
                }

            }
        }
        return mainList;
    }

    public List<List<Integer>> optimalApproach(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(i > 0 && nums[i-1] == nums[i]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    mainList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return mainList;
    }

}
