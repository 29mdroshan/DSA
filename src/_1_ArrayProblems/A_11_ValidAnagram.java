package _1_ArrayProblems;

import java.util.Arrays;

public class A_11_ValidAnagram {

    // leetcode : https://leetcode.com/problems/valid-anagram/description
    // neetcode : https://neetcode.io/problems/is-anagram

    public boolean myApproach(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public boolean optimalApproach(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] store = new int[26];
        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }
        for (int n : store) if (n != 0) return false;
        return true;
    }
}
