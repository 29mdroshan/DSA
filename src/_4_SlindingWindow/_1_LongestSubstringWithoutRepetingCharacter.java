package _4_SlindingWindow;

import java.util.HashMap;
import java.util.Map;

public class _1_LongestSubstringWithoutRepetingCharacter {
    // https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            if (map.get(s.charAt(r)) != null) {
                if (map.get(s.charAt(r)) >= l) {
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            map.put(s.charAt(r), r);
            maxLen = Integer.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
