class Solution {
      public static int pivotInteger(int n) {
      if(n==0 || n==1) return 1;
      int total_Sum=n*(n+1)/2;
  int x=(int)Math.sqrt(total_Sum);        
   return x*x==total_Sum?x:-1;
    }
}