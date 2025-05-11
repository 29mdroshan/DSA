package _1_ArrayProblems;

public class A_12_ProductExceptSelf {
    // leetcode : https://leetcode.com/problems/product-of-array-except-self/
    // neetcode : https://neetcode.io/problems/products-of-array-discluding-self

    public int[] myApproach(int[] nums) {
        // Did not worked for larger input
         int prefix = 1;
         int[] res = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
             int sum = 1;
             for (int j = i + 1; j < nums.length; j++) {
                 sum *= nums[j];

             }
             res[i] = sum * prefix;
             prefix *= nums[i];
         }
         return res;
    }
    public int[] optimalApproach(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }

//    public static void main(String args[]) {
//        ProductExceptSelf p = new ProductExceptSelf();
//        p.optimalApproach(new int[]{1, 2, 3, 4});
//    }
}
