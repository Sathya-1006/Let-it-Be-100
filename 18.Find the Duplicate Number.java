//18.Leetcode
//287. Find the Duplicate Number


class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        int temp=0;
        for(int num:nums)
        {
            if(!seen.add(num))
            {
                temp=num;
            }
        }
        return temp;
    }
}
