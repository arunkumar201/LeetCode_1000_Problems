class Solution {
  public static int[] answerQueries(int[] a, int[] q) {
     int n=a.length;
      int m=q.length;
     Arrays.sort(a);
      // int sum=0;
     int res[]=new int[m];
     int prefix[]=new int[n];
     for(int i=1;i<n;i++) {
         // sum += a[i];
         a[i]+=a[i-1];
     }
     for(int j=0;j<m;j++) {
         int i=Arrays.binarySearch(a,q[j]);
         res[j]=Math.abs(i+1);
         }
        return res;
    }
}