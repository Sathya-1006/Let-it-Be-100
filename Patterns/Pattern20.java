// 5

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *



import java.util.*;

public class Pattern20 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //space
            for(int j=1;j<=(n*2)-(i*2);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

        for(int i=n-1;n>=1;i--){
            //star
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }

            //space
            for(int j=(n*2)-(i*2);j>=1;j--){
                System.out.print(" ");
            }
            //star
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
