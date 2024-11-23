//22.Leetcode
//2529. Maximum Count of Positive Integer and Negative Integer


class Solution {
    public int maximumCount(int[] nums) {
        int neg=0;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
            {
                neg++;
            }
            else if(nums[i]>0)
            {
                pos++;
            }
            else if(nums[i] == 0)
            {
                continue;
            }
        }
        int res=neg>pos?neg:pos;
        return res;
    }
}
