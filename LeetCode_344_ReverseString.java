// LeetCode 344 - Reverse String.
// Problem: Reverse a string in-place.

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        
        // Swap characters from both ends towards the center
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
    }
}
