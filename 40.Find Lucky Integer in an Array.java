//40.Leetcode
//1394. Find Lucky Integer in an Array



class Solution {
    public int findLucky(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count =0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] == arr[j]) count++;
            }
            if(count == arr[i]) res.add(arr[i]);
        }
        if(res.isEmpty()) return -1;
        return Collections.max(res);
    }
}
