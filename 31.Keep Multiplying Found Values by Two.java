//31.Leetcode
//2154. Keep Multiplying Found Values by Two
class Solution {
    public int findFinalValue(int[] nums, int original) {

      
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i] == original)
           {
             original *=2;
             i= -1;
           }
        }
        return original;
    }
}
