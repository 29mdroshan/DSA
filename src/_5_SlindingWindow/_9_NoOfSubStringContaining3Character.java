package _5_SlindingWindow;

public class _9_NoOfSubStringContaining3Character {

    public int noOfSubstring() {
        // approach used is using index
        String s = "bbacba";
        int count = 0;
        int[] lastseen = {-1,-1,-1};

        for(int i =0 ; i< s.length(); i++) {
            lastseen[s.charAt(i) - 'a'] = i;
            if(lastseen[0] != -1 && lastseen[1] != -1  &&lastseen[2] != -1) {
                count = count + (1 + Integer.min(lastseen[0], Integer.min(lastseen[1], lastseen[2])));
            }
        }
        return  count;
    }
}
