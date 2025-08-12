class Solution {
    public void printNumbers(int n) {
        pri(1,n);
    }
    public static void pri(int i,int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        n--;
        pri(i,n);
    }
}
