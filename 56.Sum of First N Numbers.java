import java.util.*;

class Solution {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        sum(1,n);
    }static int sum=0;
    public static void sum(int i,int n){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        i++;
        sum(i,n);
        
    }
}
