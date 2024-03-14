class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
        int res=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            int sum=0;
            for(int j=i;j<len;j++){
                sum+=nums[j];
                if(sum==goal){
                    res++;
                }
            }
        }
        return res;
    }
}