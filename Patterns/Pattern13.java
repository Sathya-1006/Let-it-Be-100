// 5

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int num=1;
        //rows
        for(int i=1;i<=n;i++){
            //right angle triangle
            for(int j=1;j<=i;j++){
               System.out.print(num+" ");
               num+=1;// every time num gets incremented by 1
            }
            System.out.println();
        }
    }
}
