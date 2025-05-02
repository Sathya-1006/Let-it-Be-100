import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={3,5,5,6,8,2};
		
		int large=arr[0];
		int sec=-1;int temp;
		for(int i=0;i<arr.length;i++){
		    
		    if(arr[i] > large){
		        sec=large;
		        large=arr[i];
		        
		    }
		}
		System.out.println("Large="+large+"Sec large="+sec);
	}
}
