class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // double logResult = Math.log(n) / Math.log(2);
        // return Math.abs(logResult - Math.round(logResult)) < 1e-10;
                return ((n & (n - 1)) == 0);

    }

}