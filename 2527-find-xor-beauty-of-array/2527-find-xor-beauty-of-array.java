class Solution {
// public int xorBeauty(int[] nums) {
 public  static  int xorBeauty(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
                    result ^=nums[i];
                }
        return result;
    }
}