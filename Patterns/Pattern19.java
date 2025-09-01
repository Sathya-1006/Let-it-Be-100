// 5
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sp=0;
        //forward
        for(int i=0;i<n;i++){
            //star
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<sp;j++){
                System.out.print(" ");

            }

            //star
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            sp+=2;
            System.out.println();
        }

        //backward
        sp=8;
       for(int i=1;i<=n;i++){
           //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<sp;j++){
                System.out.print(" ");

            }

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            sp-=2;
            System.out.println();
        }

    }
}
