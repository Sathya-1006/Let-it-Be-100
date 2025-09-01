// 5

// 1
// 01
// 101
// 0101
// 10101



import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        //startin number is 1
        int start=1;
        //To print 5 rows
        for(int i=0;i<n;i++){   
            //if current row is even, start ==1
            if(i%2==0) start=1;

            //odd row, start=0;
            else start=0;

            //to print right angle triangle
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;  // to flip, bcz the adjacent is opp.1=>0, 0=>1
            }
            System.out.println();
        }
    }
}
