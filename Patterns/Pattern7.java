//5

//     *  
//    ***
//   *****
//  *******
// ********* 

import java.util.*;

public class Pattern7 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
           
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
