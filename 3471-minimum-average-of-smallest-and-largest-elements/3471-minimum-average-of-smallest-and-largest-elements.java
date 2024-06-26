class Solution {
    public double minimumAverage(int[] nums) {
        double minAverage = Double.MAX_VALUE;
        Arrays.sort(nums);
        int len = nums.length;
        int right = len - 1;
        int left = 0;
        while (right > left) {
            double average = (nums[right] + nums[left]) / 2.0;
            minAverage = Math.min(minAverage, average);
            right--;
            left++;
        }
        return minAverage;
    }
}