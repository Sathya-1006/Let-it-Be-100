//20.GFG
//Missing number in an Array


class Solution {
    int missingNumber(int arr[]) {
        int n=arr.length+1;
        int nat=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
        }
        return nat-sum;
    }
}
