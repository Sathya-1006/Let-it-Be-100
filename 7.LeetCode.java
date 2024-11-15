//7.LeetCode
//342. Power of Four

class Solution {
    public boolean isPowerOfFour(int n) {
        boolean r=false;
        for(int i=0;i<=30;i++)
        {
            if(Math.pow(4,i) == n)
            {
                r=true;
                break;
            }
        }return r;
        
    }
}
