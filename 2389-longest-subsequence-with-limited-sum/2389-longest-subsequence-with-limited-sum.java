class Solution {
    public static int[] answerQueries(int[] a, int[] q) {
     int n=a.length;
      int m=q.length;
     Arrays.sort(a);
     int res[]=new int[m];
     int sum=0;
     int count=0;
     int k=0;
     // int prefix[]=new int[n];
     for(int i=1;i<n;i++) {
         a[i]+=a[i-1];
     }

  
     for(int i=0;i<m;i++) {
            int j = Arrays.binarySearch(a,q[i]);
            res[i] = Math.abs(j + 1);
         }
     
        return res;
    }
}