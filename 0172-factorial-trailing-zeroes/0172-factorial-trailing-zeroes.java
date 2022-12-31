class Solution {
    public int trailingZeroes(int n) {
       if(n==0) return 0;
        // int count = 0;
//         for (int i = 5; n / i >= 1; i *= 5)
//             count += n / i;
 
//         return count;
        return n==0?0:n/5+trailingZeroes(n/5);
    }
    
}