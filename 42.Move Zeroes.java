//42.Leetcode
//283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
       int j=-1;int temp=0;
    //To find zero
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0){
            j=i;
            break;
        }
    }
    if (j==-1) 
    {
        return;
    }
       for(int i=j+1;i<nums.length;i++)
       {
        if(nums[i] !=0 )
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
       }

    }
}
