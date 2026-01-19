class Solution {
    public boolean canAliceWin(int[] nums) {
        int b=0;
        int a=0;
    
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                b+=nums[i];
            }else{
                a+=nums[i];
            }
        }
        if(a>b || b>a){
            return true;
        }
        else{
            return false;
        }
        
    }
}
