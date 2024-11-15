//8.LeetCode
//2119. A Number After a Double Reversal

class Solution {
    public boolean isSameAfterReversals(int num) {
        int rem=0;int sum=0;int temp=num; boolean res=false;
        for(int i=0;i<2;i++)
        {

        while(num!=0)
        {
            rem=num%10;
            sum = rem +(sum*10);
            num/=10;
        }
        num = sum;
        sum=0;
        }
    if(temp==num)
    {
        res =true;
    }
    return res;  
    }
    
}
