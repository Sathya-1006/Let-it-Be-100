// A
// BB
// CCC
// DDDD
// EEEEE


import java.util.Scanner;

public class Pattern16 {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=0;i<n;i++){
            char ch='A' + i;
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();

        }
     }
}
