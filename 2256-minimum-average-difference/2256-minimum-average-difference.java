class Solution {
    public static int minimumAverageDifference(int[] a) {
        int n= a.length;
        if(n==0) return 0;
        if(n==1) return 0;
        int x=0;
        for(int s:a){
            if(s==0) x++;
        }
        if(x==n) return 0;
      //Prefix sum Array
      long []prefix_Sum=new long[n];
      long s=0;
      for(int i=0;i<n;i++){
         s+=a[i];
          prefix_Sum[i]=s;
      }
      long total_Sum=prefix_Sum[n-1];
        // System.out.println(Arrays.toString(prefix_Sum));
      int min_idx=0;
     int min= Integer.MAX_VALUE;
     for (int i = 0; i<n;i++) {
        long avg_till_i=Math.absExact(Math.abs(prefix_Sum[i]/(i+1)));
         System.out.print(avg_till_i+" ");
         long avg_from_i_to_N=0;
         if(n-i-1!=0)
     avg_from_i_to_N= Math.absExact(Math.abs((total_Sum-prefix_Sum[i]))/(n-i-1));
         System.out.print(avg_from_i_to_N+" ");
         int Difference=(int)Math.abs(avg_from_i_to_N-avg_till_i);
        //  System.out.println(Difference);
           if(min>Difference){
             min=Difference;
             min_idx=i;
         }
         
     }
        return min_idx;
    }

}