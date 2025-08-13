
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=4;
        int l=0;
        int r=n- 1;
        rev(arr,l,r);
       
        
    }
    public static void rev(int[] arr,int l,int r){
        if(l>r){
            System.out.print(Arrays.toString(arr));
            return;
        }
        int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
            rev(arr,l,r);
        
    }
}
