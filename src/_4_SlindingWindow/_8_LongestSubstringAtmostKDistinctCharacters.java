package _4_SlindingWindow;

import java.util.HashMap;

import java.util.Map;



public class _8_LongestSubstringAtmostKDistinctCharacters {
    public String longestSubString() {
        String s = "aababba";
        int left = 0 , right = 0, max = 0, k = 2;
        String substring  = "";
        Map<Character, Integer> map = new HashMap<>();
        while(right < s.length()) {
            if(map.get(s.charAt(right)) == null) {
                map.put(s.charAt(right), 1);
            } else {
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
            }
//            while(map.size() > k) {
//                map.put(s.charAt(left), map.get(s.charAt(left)) -1);
//                if(map.get(s.charAt(left)) == 0) {
//                    map.remove(s.charAt(left));
//                }
//                left++;
//            }

            // optimisation

            if(map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) -1);
                if(map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }

            right++;
            if(right-left> max) {
                max = right - left +1;
                substring = s.substring(left, right);
            }


        }
        return substring;
    }
}
