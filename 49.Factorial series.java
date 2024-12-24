//49.Factorial series.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner obj= new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int n=obj.nextInt();
	    long n1=0,n2=1,temp,num=0;
	     System.out.print(n1+" "+n2);
	    for(int i=0;i<n- 2;i++){
	        num=n1+n2;
	        System.out.print(" "+num);
	        temp=n1;
	        n1=n2;
	        n2=num;
	        
	    }
	    
	    
	}
}
