// 5

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

import java.util.*;

public class Pattern10 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        // My solution: 
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //striver's
        // for(int i=1;i<=2*n-1;i++){
        //     int star=i;
        //     if(i>n) star=2*n-i;
        //     for(int j=1;j<=star;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
