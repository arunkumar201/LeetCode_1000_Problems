class Solution {
    public boolean isMonotonic(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i] && count2 == 0) {
                count1++;
            } else if (nums[i - 1] > nums[i] && count1 == 0) {
                count2++;
            } else if (nums[i - 1] == nums[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}