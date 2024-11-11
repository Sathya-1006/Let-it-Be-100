//Leetcode
//242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        //if length of both strings unequal then return false
        if(s.length()!=t.length())
        {
            return false;
        }

        //convert strings to char array
        char[] str=s.toCharArray();
        char[] ttr=t.toCharArray();


        //sort each array
        Arrays.sort(str);
        Arrays.sort(ttr);

        //check whether both are equal
        return Arrays.equals(str,ttr);
    }
}
