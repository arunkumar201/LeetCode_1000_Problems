class Solution {
public int[] plusOne(int[] a) {
       int n=a.length;
    int i=n-1;
    
    for(;i>=0;i--){
       if(a[i]<9){
           a[i]++;
           break;
       }else{
           a[i]=0;
       }
    }
    if(i>=0) return a;
    int ans[]=new int[n+1];
    ans[0]=1;
     for (i = 1; i < n + 1; i++) ans[i] = a[i - 1];
    return ans;
}
}