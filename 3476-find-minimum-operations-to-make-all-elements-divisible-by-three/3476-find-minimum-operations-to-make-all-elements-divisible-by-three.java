class Solution {
 public int minimumOperations(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int ones = 0, twos = 0;
        for (int i = 0; i < n; i++) {

            int remainder = nums[i] % 3;
            if (remainder == 1) {
                ones++;
            } else if (remainder == 2) {
                twos++;
            }
        }
        ans = ones + twos;
        return ans;
    }
}