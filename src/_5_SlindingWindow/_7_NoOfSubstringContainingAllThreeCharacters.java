package _5_SlindingWindow;

public class _7_NoOfSubstringContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int[] last = {-1,-1,-1};
        int count =0;
        for(int i = 0 ; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
            if(last[0] != -1 && last[1] != -1 && last[2] != -1) {
                count += 1 + Integer.min(last[0], Integer.min(last[1], last[2]));
            }
        }
        return count;
    }
}
