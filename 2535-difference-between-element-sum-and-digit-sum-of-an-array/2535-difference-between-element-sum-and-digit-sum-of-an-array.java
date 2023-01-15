class Solution {
      public  static int   getSum(int n,int val){
        if (n < 10) {
            val = val + n;
            return val;
        }
        return getSum(n / 10, (n % 10) + val);
    }
    public static int differenceOfSum(int[] a) {
        int sum = 0;
        for (int i : a) sum += i;
        int d_sum = 0;
        for (int i : a) {
            if (i < 10) d_sum += i;
            else {
                d_sum += getSum(i, 0);
            }
        }
        return Math.abs(sum-d_sum);
    }
}