package _2_TwoPointer;

import java.util.Arrays;

public class _1_BuyAndSellStock {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    // int[] prices = {7,2,5,1,2,5};

    // Related Problems solved
    // 1. https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
    // 2. https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/1558045068/
    public int maxProfit(int[] prices) {
        int l = 0 , r = l + 1, maxProfit = 0;
        int n = prices.length;
        while(r < n) {
            if(prices[r] > prices[l]) {
                maxProfit += prices[r] - prices[l];
                l = r;
                if(l+2 <= n - 2) {
                    l += 2;
                    r = l;
                } else{
                    break;
                }
            } else {
                l = r;
            }
            r++;

        }
        return maxProfit;
    }

    public static void main(String[] args) {
//        _1_BuyAndSellStock  b = new _1_BuyAndSellStock();
//        int[] prices = {2,1,2,0,1};
//        System.out.println(b.maxProfit(prices));
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6};
        int[] nums = nums1.clone();
        int m =3 , n= 3;
        int  i = 0, j = 0, z = 0;
        while(i < m && j < n) {
            if(nums[i] <= nums[j]) {
                nums1[z++] = nums[i++];
            } else{
                nums1[z++] = nums2[j++];
            }
        }
        while(i < m) {
            nums1[z++] = nums[i++];
        }
        while(j < n) {
            nums1[z++] = nums2[j++];
        }

    }
}
