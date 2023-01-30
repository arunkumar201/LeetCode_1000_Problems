class Solution {
    public int tribonacci(int n) {
       int ans=0;
        int a=0;
        int b=1;
        int c=1;
        for(int i=1;i<=n;i++){
            ans=a+b+c;
             a=b;
            b=c;
            c=ans;
        }
        return a;
    }
}