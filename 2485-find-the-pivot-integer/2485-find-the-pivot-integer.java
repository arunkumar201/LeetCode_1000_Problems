class Solution {
      public static int pivotInteger(int n) {
      if(n==0 || n==1) return 1;
      int total_Sum=n*(n+1)/2;
       int curr_Sum=0;
      for (int i = 1; i <=n;i++) {
          curr_Sum+=i;
          if(curr_Sum==(total_Sum-curr_Sum+i)) return i;
      }
return -1;
    }
}