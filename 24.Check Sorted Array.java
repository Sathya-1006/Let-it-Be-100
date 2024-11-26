//24.Code360
//Check Sorted Array

public class Solution {
    public static int isSorted(int n, int []a) {
        int count=0;
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]<=a[i+1])
            {
                count++;
            }
        }if(count ==a.length-2)return 1;
        return 0;
    }
}
