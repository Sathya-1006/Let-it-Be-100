import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		long num=obj.nextLong();
		if(num >=0){
		    if(num ==0){
		        System.out.println("Zero");
		    }
		    else{
		        System.out.println("Positive number");
		    }
		    
		}else{
		        System.out.println("Negative number");
		    }
	}
}
