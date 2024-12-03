//35. Leetcode
//2109. Adding Spaces to a String - Approach-1
class Solution {
    public String addSpaces(String s, int[] spaces) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for(int j=0;j<spaces.length;j++)
            {
                if(spaces[j]== i) res+=" ";
            }res+=ch;
        }return res;
    }
}
