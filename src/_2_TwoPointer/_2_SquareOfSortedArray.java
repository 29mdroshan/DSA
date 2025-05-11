package _2_TwoPointer;

import java.util.Arrays;

public class _2_SquareOfSortedArray {

    // https://leetcode.com/problems/squares-of-a-sorted-array/description/
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares2(int[] nums) {
        int n = nums.length, idx = n;
        // Get the first positive index
        for(int i = 0 ; i < n; i++) {
            if(nums[i] >= 0) {
                idx = i;
                break;
            }
        }

        // split the array into positive and negative value array
        int[] nums1 = Arrays.copyOfRange(nums, 0, idx);
        int[] nums2 = Arrays.copyOfRange(nums, idx, n);

        // Apply merge sort
        int i = nums1.length -1, j = 0, k = nums2.length - 1, z =0;
        while(i >= 0 && j <= k) {
            if(nums1[i]*nums1[i] <= nums2[j]* nums2[j]) {
                nums[z++] = nums1[i]*nums1[i];
                i--;
            } else{
                nums[z++] = nums2[j]*nums2[j];
                j++;
            }
        }
        while(i >= 0) {
            nums[z++] = nums1[i]*nums1[i];
            i--;
        }

        while(j <= k) {
            nums[z++] = nums2[j]*nums2[j];
            j++;
        }
        return nums;
    }
}
