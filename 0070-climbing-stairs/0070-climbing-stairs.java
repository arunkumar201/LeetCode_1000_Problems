class Solution {
   public static int fibo(int n){
        int num1 = 1, num2 = 1;
  
        int res =0;
          int i=0;
        // Iterate till counter is N
        while (i <=n) {
             if(i==n) return num1;
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i++;
        }
       return 0;
   }
    
    public int climbStairs(int n) {
        if(n<0) return 0;
        
        if(n==0 || n==1){
            return  1;
        }
        return fibo(n);
      
    }
}