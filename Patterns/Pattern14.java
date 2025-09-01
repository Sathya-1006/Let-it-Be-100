// 5

// A
// AB
// ABC
// ABCD
// ABCDE

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
