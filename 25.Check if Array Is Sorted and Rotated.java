//25.Leetcode- Approach-1
//1752. Check if Array Is Sorted and Rotated

class Solution {
    public boolean check(int[] nums) {
        int count=0;boolean res=false;int temp=0;int n=nums.length;
        while(n!=0)
        {
            //rotation
            temp= nums[n-1];
            for(int i=n;i>0;i--)
            {   if(i<n-1)
                nums[i]=nums[i-1];
            }
            //check sorted
            for(int i=0;i<n-2;i++)
        {
            if(nums[i]<=nums[i+1])
            {
                count++;
            }
        }
        if(count ==n-2)
        res=true;
        else
        n--;
        }
        
    return res;
    }
}
