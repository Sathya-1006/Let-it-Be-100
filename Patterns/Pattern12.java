// 4

// 1     1
// 12   21
// 123 321
// 12344321

import java.util.Scanner;

public class Pattern12 {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){
            //num
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<(n*2)-(2*i);j++){
                System.out.print(" ");
            }
            //num
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
     }
}
