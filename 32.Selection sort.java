//32.GFG
//Selection sort
class Solution {
    void selectionSort(int[] arr) {
        for(int i=0;i<arr.length -1 ;i++)
        {
            int min=i;
            //finding min
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            //swap
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
}

