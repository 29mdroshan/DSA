package _2_TwoPointer;

public class _4_RainWaterTrap {
    // leetcode : https://leetcode.com/problems/trapping-rain-water/
    // neetcode : https://neetcode.io/problems/trapping-rain-water
    public int firstApproach(int[] height) {
        int n = height.length;
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        int[] rightmax = new int [n];
        rightmax[n-1] = height[n-1];
        int left = 1, right = n-2;
        while(left < n || right >= 0){
             if(left < n) {
                 leftmax[left] = Math.max(leftmax[left -1], height[left]);
                 left++;
             }
            if(right >=0) {
                rightmax[right] = Math.max(rightmax[right +1], height[right]);
                right--;
            }
        }
        int total = 0;
        for(int i = 0; i< n;i++) {
            int sum = Math.min(leftmax[i], rightmax[i]) - height[i];
            if(sum >=0) {
                total +=sum;
            }
        }
        return total;
    }

    public int secondApproach(int[] height) {
        // Enhanced space by eliminating  leftmax array
        int n = height.length;
        int[] rightmax = new int [n];
        int leftmax = 0;
        rightmax[n-1] = height[n-1];
        int right = n-2;
        while( right >= 0){
            if(right >=0) {
                rightmax[right] = Math.max(rightmax[right +1], height[right]);
                right--;
            }
        }
        int total = 0;
        for(int i = 0; i< n;i++) {
            leftmax= Math.max(leftmax, height[i]);
            int sum = Math.min(leftmax, rightmax[i]) - height[i];
            if(sum >=0) {
                total +=sum;
            }
        }
        return total;
    }

    public int trap(int[] height) {
       // eliminated both leftmax and rightmax array
        int left = 0, right = height.length - 1;
        int res = 0;
        int leftmax = height[left], rightmax = height[right];
        while (left < right) {
            if (leftmax <= rightmax) {
                left++;
                leftmax = Math.max(leftmax, height[left]);
                res += leftmax - height[left];
            } else {
                right--;
                rightmax = Math.max(rightmax, height[right]);
                res += rightmax - height[right];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        _4_RainWaterTrap a = new _4_RainWaterTrap();
        int[] height =  {0,1,0,2,1,0,1,3,2,1,2,1};
        a.firstApproach(height);
    }
}
