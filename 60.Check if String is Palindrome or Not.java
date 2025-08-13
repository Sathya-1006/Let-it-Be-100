class Solution {   
    public boolean palindromeCheck(String s) {
        return pal(s,0,s.length()- 1);
    }
    public static boolean pal(String s,int l,int r){
      //if mismatched
        if(s.charAt(l)!=s.charAt(r)){
           
            return false;
        }
      //if r & l crosses each other- means all char matched
        if(l>=r){
            
            return true;
        }
        return pal(s,l+ 1,r- 1);
    }
}
