import java.util.*;


public class Pattern1 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int r=obj.nextInt();

        System.out.println("Enter the no.of columns: ");
        int c=obj.nextInt();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       

    }
}

// Enter the no.of rows: 
// 5
// Enter the no.of columns: 
// 4

// ****
// ****
// ****
// ****
// ****