//28.LeetCode - APPROACH 1
//189. Rotate Array
class Solution {
    public void rotate(int[] nums, int k) {
        int temp=0;
        while(k!=0)
        {temp=nums[nums.length-1];
            for(int i=nums.length -1;i>0;i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            k--;temp=0;
        }
        
            System.out.print(Arrays.toString(nums));
        
        
    }
}
