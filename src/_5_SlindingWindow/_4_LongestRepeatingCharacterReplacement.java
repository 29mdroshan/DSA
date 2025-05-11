package _5_SlindingWindow;

import java.util.HashMap;
import java.util.Map;

public class _4_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s1, int k1) {
        String s = "AAABBACD";
        int k = 2;
        int l = 0 , r = 0, maxLen = 0, maxf = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(r < s.length()) {
            char chr = s.charAt(r);
            map.put( chr, map.getOrDefault(chr, 0) + 1);
            maxf = Integer.max(maxf, map.get(chr));
            if((r-l+1) - maxf > k) {
                char chl = s.charAt(l);
                map.put(chl, map.get(chl) -1);
                if(map.get(chl) == 0) {
                    map.remove(chl);
                }
                maxf = 0;
                // for (Map.Entry<Character,Integer> entry : map.entrySet()) {
                //     maxf = Integer.max(maxf, entry.getValue());
                // }
                l++;
            }
            if((r-l+1) - maxf <= k) {
                maxLen = Integer.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }

    public static void main(String args[]) {
        _4_LongestRepeatingCharacterReplacement l = new _4_LongestRepeatingCharacterReplacement();
        l.characterReplacement("", 1);

    }
}
