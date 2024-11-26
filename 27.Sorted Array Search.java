//27.GFG
//Sorted Array Search

class Solution {
    static boolean searchInSorted(int arr[], int k) {
        boolean res=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == k)
            {
                res=true;
            }
        }
        
        return res;
    }
}
