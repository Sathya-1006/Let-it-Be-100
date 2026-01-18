class Solution {
    public String firstPalindrome(String[] words) {
        String temp="";
        for(int i=0;i<words.length;i++){
            String sam="";
            sam=words[i];
            StringBuilder obj= new StringBuilder(sam);
            obj.reverse();
            String rev=obj.toString();
            if(rev.equals(words[i])){
                return rev;
            }
        }
        return temp;
        
    }
}
