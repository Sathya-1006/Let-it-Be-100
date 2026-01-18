class Solution {
    public int countDigits(int num) {
        int cnt=0;int sp=num;
        while(num!= 0){
            int rem=num% 10;
            if(sp % rem ==0){
                cnt++;
            }
            num/=10;

        }return cnt;
        
    }
}
