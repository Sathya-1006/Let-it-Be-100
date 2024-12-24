//50.Copying 2 array into 1 array
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner obj= new Scanner(System.in);
	   
	    
	    
	    System.out.print("Enter array1 size: ");
	    int n1=obj.nextInt();
	    int a1[]=new int[n1];
	    System.out.println("Enter array1 elements: ");
	    for(int i=0;i<n1;i++)
	    {
	        a1[i]= obj.nextInt();
	        
	    }
	    
	    System.out.print("Enter array2 size: ");
	    int n2=obj.nextInt();
	    int a2[]=new int[n2];
	    System.out.println("Enter array2 elements: ");
	    for(int i=0;i<n2;i++)
	    {
	        a2[i]= obj.nextInt();
	        
	    }
	    
	 
	    
	    int n3=n1+n2;
	    int a3[]=new int[n3];
	    
	    System.arraycopy(a1,0,a3,0,n1);
	    System.arraycopy(a2,0,a3,n1,n2);
	    
	    for(int i:a3)
	    {
	        System.out.print(i+" ");
	    }
	    
	}
}
