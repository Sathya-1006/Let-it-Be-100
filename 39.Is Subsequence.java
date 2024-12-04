//39.Leetcode
//392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if (ch1 == ch2) {
                i++;
            }
            j++;
        }
        return i == s.length();

    }
}
