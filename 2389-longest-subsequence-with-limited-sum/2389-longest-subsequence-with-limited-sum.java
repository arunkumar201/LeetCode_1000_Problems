class Solution {
    public static int[] answerQueries(int[] a, int[] q) {
     int n=a.length;
      int m=q.length;
     Arrays.sort(a);
     int res[]=new int[m];
     int sum=0;
     int count=0;
     int k=0;
     int prefix[]=new int[n];
     for(int i=0;i<n;i++) {
         sum += a[i];
         prefix[i]=sum;
     }
        // System.out.println(Arrays.toString(q));
        // System.out.println(Arrays.toString(prefix));
  
     for(int i=0;i<m;i++) {
            int j = Arrays.binarySearch(prefix,q[i]);
            res[i] = Math.abs(j + 1);
         }
     
        return res;
    }
}