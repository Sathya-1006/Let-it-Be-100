//48.Factorial of a number

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner obj= new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int n=obj.nextInt();
	    int res=1;
	    while(n!=0){
	        res= res*(n);
	        n--;
	    }System.out.print("Factorial of a number: "+res);
	}
}
