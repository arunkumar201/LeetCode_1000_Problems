class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n=nums.length;
    

        for(int i=0;i<n;i++){
          int res_sum=t-nums[i];
            for(int j=i+1;j<n;j++){   
                if(nums[j]==res_sum){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}