package _2_TwoPointer;

public class _5_LongestMountain {
    // https://leetcode.com/problems/longest-mountain-in-array/
    //  Input: arr = [2,1,4,7,3,2,5]
    //  Output: 5

    public int longestMountain(int[] arr) {
        int n = arr.length, result = 0;
        for(int i = 1; i < n - 1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                int j = i-1, k= i+1;
                while(j > 0 && arr[j] > arr[j -1]) {
                    j--;
                }
                while(k < n - 1 && arr[k] > arr[k+1]) {
                    k++;
                }
                result = Math.max(result, k -j +1);
            }
        }
        return result;
    }
}
