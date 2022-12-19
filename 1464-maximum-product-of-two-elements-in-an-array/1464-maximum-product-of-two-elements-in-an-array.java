class Solution {
    public static int maxProduct(int[] nums) {
        int First_max=Integer.MIN_VALUE;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(First_max<nums[i]){
                First_max=nums[i];
                k=i;
            }
        }
        int Second_max=Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(Second_max<nums[i] && k!=i ){
                Second_max=nums[i];
            }
        }
       return (First_max-1)*(Second_max-1);
    }
}