class Solution {
    public static int alternateDigitSum(int n) {
        if(n<10) return n;
        int sum = 0;
        int sign=-1;
        while(n!=0) {
            sum += (n % 10)*(-1*sign);
            n /= 10;
            sign*=-1;
        }
        return sum*sign;
    }
}