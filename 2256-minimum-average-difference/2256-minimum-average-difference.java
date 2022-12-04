class Solution {
    public static int minimumAverageDifference(int[] a) {
        int n= a.length;
        if(n==0) return 0;
        if(n==1) return 0;
      //Prefix sum Array
      long []prefix_Sum=new long[n];
      long s=0;
      for(int i=0;i<n;i++){
         s+=a[i];
         prefix_Sum[i]=s;
      }
      long total_Sum=prefix_Sum[n-1];
      int min_idx=0;
     int min= Integer.MAX_VALUE;
     for (int i = 0; i<n;i++) {
        long avg_till_i=(Math.abs(prefix_Sum[i]/(i+1)));
         long avg_from_i_to_N=0;
         if(n-i==1) avg_from_i_to_N=0;
         else
          avg_from_i_to_N= (Math.abs((total_Sum-prefix_Sum[i]))/(n-i-1));
         int Difference=(int)Math.abs(avg_from_i_to_N-avg_till_i);
         if(min>Difference){
             min=Difference;
             min_idx=i;
         }
     }
        return min_idx;
    }
}