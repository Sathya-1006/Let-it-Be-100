//23.GFG
//Largest Element in Array

class Solution {
    public static int largest(int[] arr) {
       if(arr.length < 1)
       {
           return arr[0];
       }
      int max=arr[0];
    
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]>max){
           
          max=arr[i];
             
         }
     }
     return max;
    }
}
