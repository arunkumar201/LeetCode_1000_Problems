class Solution {
     public  static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int  ans=0;
        if(n<0) return 0;
        if(n<2 && nums[0]>=target ){
            return 1;
        }else if(n<2 && nums[0]<target){
            return 0;
        }
        int i=0;
        int j=0;
        int sum=0;
        int currentSize=Integer.MAX_VALUE;
        while(i<=j && j<n){
            if(nums[i]>=target){
                return 1;
            }
            sum+=nums[j];
            while(sum>=target) {
                currentSize = Math.min(currentSize, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
      return currentSize==Integer.MAX_VALUE ? 0:currentSize;
    }
}