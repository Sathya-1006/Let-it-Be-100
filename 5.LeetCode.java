//5.LeetCode
//231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean r=false;
        for(int i=0;i<=30;i++)
        {
            if(Math.pow(2,i) == n)
            {
                r=true;
                break;
            }
        }
        return r;
    }
}
