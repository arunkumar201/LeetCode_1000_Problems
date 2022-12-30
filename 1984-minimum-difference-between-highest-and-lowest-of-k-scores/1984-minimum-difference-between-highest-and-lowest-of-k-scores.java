class Solution {
      public static int minimumDifference(int[] a, int k) {
       int diff=Integer.MAX_VALUE;
       int n=a.length;
       if(n==1){
           return 0;
       }
       Arrays.sort(a);
       for(int i=0;i<=n-k;i++){
         diff=Math.min(diff,a[i+k-1]-a[i]);
       }
    return diff;
    }
}