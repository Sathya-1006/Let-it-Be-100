import java.util.*;

public class Pattern4 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }

    }
}

// 5

// 1 
// 2 2 
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5