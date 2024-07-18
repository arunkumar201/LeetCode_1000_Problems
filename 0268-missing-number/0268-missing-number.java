class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = (n * (n + 1)) / 2;
        int items_sum = 0;
        for (int i : nums) {
            total_sum -= i;
        }
        return total_sum;
    }
}