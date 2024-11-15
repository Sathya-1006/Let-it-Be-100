//6.LeetCode
//326. Power of Three


class Solution {
    public boolean isPowerOfThree(int n) {
        boolean r=false;
        for(int i=0;i<=30;i++)
        {
            if(Math.pow(3,i) == n)
            {
                r=true;
                break;
            }
        }return r;
        
    }
}
