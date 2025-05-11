public class LongestPalindrome {

    public void printLongestPalindrome() {
        String s = "abacddcaz";
        String res = "";

        String longest = "";
        for(int i = 0; i < s.length(); i++) {
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            // Even-length palindromes (two character center)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }


        }
        System.out.println(res);
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // After the loop, left and right are one step beyond the valid palindrome
        return s.substring(left + 1, right);
    }
}
