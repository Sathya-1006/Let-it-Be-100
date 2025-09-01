// 5

// ABCDE
// ABCD
// ABC
// AB
// A

import java.util.Scanner;

public class Pattern15 {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch);

            }
            System.out.println();
        }
     }
}
