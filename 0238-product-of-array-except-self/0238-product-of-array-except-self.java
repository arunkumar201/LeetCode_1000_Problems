class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        //total sum after doing multiplication of all elements
        int total = 1;
        for (int i = 0; i < len; i++) {
            result[i] = total;
            total *= nums[i];
        }
        total = 1;
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= total;
            total *= nums[i];
        }
        return result;
    }
}