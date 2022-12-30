class Solution {
      public static int minimumDifference(int[] a, int k) {
       int diff=Integer.MAX_VALUE;
       int n=a.length;
       if(n==1){
           return 0;
       }
       Arrays.sort(a);
       for(int i=k-1;i<n ;i++){
         diff=Math.min(diff,a[i]-a[i-k+1]);
       }
    return diff;
    }
}