import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class dsa {

    public static int gcd(int a , int b) {
        if(a==0)
            return b;
        return gcd(b%a , a);
    }

    public static int lcm(int a , int b) {
        return (a/gcd(a, b)) * b;
    }

    public static boolean isValid(String s) {
        char ch  = s.charAt(0);
        for(int i = 0; i < s.length() ; i++) {
            if(ch != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public static int maximumLength(String s) {

        Map<String, Integer> map = new HashMap<>();

        int n = s.length();

        for(int i = 0; i < n; i++) {
            for(int j = i ; j < n; j++) {
                String temp = s.substring(i, j+1);
                map.put(temp, map.getOrDefault(temp, 0) +1);
            }
        }

        String res = "";
        for(String x : map.keySet()) {
            if(map.get(x) >= 3) {
                if(isValid(x) && x.length() >= res.length()) {
                    res = x;
                }
            }
        }
        return res.isEmpty() ?  -1 : res.length();

    }

    public static void main(String args[]) {
//        System.out.println(lcm(24, 36));
//        int[] arr = { 2, 4, 6, 8 };
//        int result = arr[0];
//        for(int i : arr) {
//            result = gcd(i, result);
//        }
//        System.out.println(result);
//
//        double sqrt = Math.sqrt(4 * 2);
        maximumLength("aaaa");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    }

}
