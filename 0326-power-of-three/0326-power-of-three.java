class Solution {
      public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
    double ans = Math.log(n) / Math.log(3);
        return Math.abs(ans - Math.round(ans)) < 1e-10;
    }
}