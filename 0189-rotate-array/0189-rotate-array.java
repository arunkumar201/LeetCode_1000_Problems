class Solution {
     public void rot(int[] nums,int l,int h){
        while(l<h){
            int a=nums[l];
            nums[l]=nums[h];
            nums[h]=a;
            l++;
            h--;
        }
    }
 public void rotate(int[] nums, int k) {   
      k=k%nums.length;
     rot(nums, 0, nums.length - 1);
    rot(nums, 0, k - 1);
    rot(nums, k, nums.length - 1);
    }
}