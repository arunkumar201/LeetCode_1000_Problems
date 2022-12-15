class Solution {
    public int missingNumber(int[] a) {
        int n=a.length;
        int sum=0;
        for(int i=0;i<=n;i++){
             sum+=i;
        }
        for(int i=0;i<n;i++){
           sum=sum-a[i];
        }
        return sum;
    }
}