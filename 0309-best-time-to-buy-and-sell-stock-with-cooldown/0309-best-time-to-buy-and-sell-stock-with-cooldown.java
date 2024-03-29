class Solution {
    public static int maxProfit(int[] prices) {
      int n=prices.length;
      if(n<=1) return 0;

      int x=0,y=-prices[0],z=0;
      for(int i=1;i<n;i++) {
          int temp=x;
          x=Math.max(x,z);
          z=y+prices[i];
          y=Math.max(y,temp-prices[i]);
      }

      return Math.max(x,z);
    }
}