package backtracing;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public List<List<String>> palindromePartitioning() {
        List<List<String>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), "aab", 0);
        return result;
    }

    private void backTrack(List<List<String>> result, List<String> temp, String s, int start) {
        if(s.length() == start) {
            temp.stream().sorted();
            result.add(new ArrayList<>(temp));
        } else{
            for(int i = start; i < s.length(); i++) {
                if(isPlaindrome(s, start, i)) {
                    temp.add(s.substring(start, i+1));
                    backTrack(result, temp, s, i+1);
                    temp.remove(temp.size() -1);
                }
            }
        }


    }

    public boolean isPlaindrome(String s, int l , int h) {
        while(l < h) {
            if(s.charAt(l++) != s.charAt(h--)) {
                return false;
            }
        }
        return true;
    }
}
