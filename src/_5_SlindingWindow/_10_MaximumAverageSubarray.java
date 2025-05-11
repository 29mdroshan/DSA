package _5_SlindingWindow;

public class _10_MaximumAverageSubarray {

    public static void main(String args[]) {
//        String num1 = "123";
//        String num2 = "456";
//
//        int n1 = num1.length(), n2 = num2.length();
//        int[] products = new int[n1 + n2];
//        for (int i = num1.length() -1; i >= 0; i--) {
//            for (int j = num2.length() - 1; j >= 0; j--) {
//                int d1 = num1.charAt(i) - '0';
//                int d2 = num2.charAt(j) - '0';
//                products[i + j + 1] += d1 * d2;
//            }
//        }
//        int carry = 0;
//        for (int i = products.length - 1; i >= 0; i--) {
//            int temp = (products[i] + carry) % 10;
//            carry = (products[i] + carry) / 10;
//            products[i] = temp;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int num : products) {
//            sb.append(num);
//        }
//        while (sb.length() != 0 && sb.charAt(0) == '0') {
//            sb.deleteCharAt(0);
//        }

        int[] flowerbed = {1,0,0,0,1}; int n = 1;
        for(int i = 1; i < n-2; i++) {
            if(flowerbed[i] == 0 && flowerbed[i-1] ==0 && flowerbed[i+1]==0) {
                flowerbed[i] = 1;
                n--;
            }
        }

    }
}
