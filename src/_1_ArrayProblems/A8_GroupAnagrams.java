package _1_ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A8_GroupAnagrams {
    // leetcode : https://leetcode.com/problems/group-anagrams/description/
    // neetcode : https://neetcode.io/problems/anagram-groups

    String[] strs = {"act","pots","tops","cat","stop","hat"};
    // My approach : Bruth Force
    public List<List<String>> myApproach() {
        List<List<String>> mainList = new ArrayList<>();
        for(int i = 0; i< strs.length; i++) {
            String sorted = sortString(strs[i]);
            List<String> subList =  new ArrayList<>();
            List<String> history =  new ArrayList<>();
            subList.add(strs[i]);
            if(!history.contains(strs[i])) {
                history.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if(sorted.equals(sortString(strs[j]))) {
                        subList.add(strs[j]);
                        history.add(strs[j]);
                    }
                }
                mainList.add(subList);
            }
        }
        return mainList;
    }

    public List<List<String>> optimalApproach() {
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            String key =sortString(s);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }

    public String sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
