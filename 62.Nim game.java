class Solution {
    public boolean canWinNim(int n) {
        int a=Math.abs(n-3);
        boolean res=true;
        
        if(n%4==0){
            res=false;
        }
        return res;
    }
}
