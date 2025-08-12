import java.util.*;

class Solution {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        fact(n);
    }
    static int facto=1;
    public static void fact(int n){
        if(n==0){
            System.out.println(facto);
            return;
        }
        
        facto=facto*n;
        n--;
        fact(n);
        
        
    }
}
