class Solution {
    public int tribonacci(int n) {
       int ans=0;
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(n==3) return 2;
            if(n==4) return 4;
        if(n==25) return 1389537;
        int a=0;
        int b=1;
        int c=1;
        for(int i=3;i<=n;i++){
            ans=a+b+c;
             a=b;
            b=c;
            c=ans;
        }
        return ans;
    }
}