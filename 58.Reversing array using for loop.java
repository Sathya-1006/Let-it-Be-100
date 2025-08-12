import java.util.*;

class Main {
    public static void main(String[] args) {
      int arr[]={1,2,3,4};
      int revarr[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
        
          revarr[i]=arr[arr.length- 1 -i];
      }
      
          System.out.print(Arrays.toString(revarr));
      
    }
}
