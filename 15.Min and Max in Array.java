//15.GFG
//Min and Max in Array

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        HashMap<Long, Long> res=new HashMap<>();
        
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
         return new Pair<>((long) min, (long) max);
        
    }
}
