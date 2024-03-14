class Solution {
         public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        int len = nums.length;
        int sum = nums[0];
        int left = 0;
        if (sum == goal) {
            res++;
        }
        for (int right = 1; right < len; right++) {
            sum += nums[right];
            while (sum > goal && left < right) {
                sum -= nums[left];
                left++;
            }
            if (sum == goal) {
                res++;
                int tempLeft = left;
                // Count all subarrays that have zeros between tempLeft and left
                while (tempLeft < right && nums[tempLeft] == 0) {
                    res++;
                    tempLeft++;
                }
            }
        }
        return res;
    }
}