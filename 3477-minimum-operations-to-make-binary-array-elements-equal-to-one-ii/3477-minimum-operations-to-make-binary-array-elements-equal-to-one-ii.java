class Solution {
        int minOperations(int[] nums) {
        int flag = 1;
        int count = 0, n = nums.length;
        for (int num : nums) {
            if (num != flag) {
                count++;
                flag = flag == 0 ? 1 : 0;
            }
        }
        return count;
    }
}