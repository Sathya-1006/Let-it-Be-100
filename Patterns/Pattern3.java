import java.util.*;
public class Pattern3 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

// 5

// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5