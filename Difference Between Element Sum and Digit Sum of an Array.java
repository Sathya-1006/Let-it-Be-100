//14.Leetcode
//2535. Difference Between Element Sum and Digit Sum of an Array
class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int dsum=0;
        int rem=0;
        for(int i=0;i<nums.length;i++)
        {
           elesum+=nums[i];

        }
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]>9)
           {
            while(nums[i] !=0)
            {
                rem=nums[i]%10;//5
                dsum+=rem;
                nums[i]/=10;

            }
           }
           else{
            dsum+=nums[i];
           }

        }
        return elesum - dsum;
        
    }
}
