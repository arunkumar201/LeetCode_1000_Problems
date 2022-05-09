
//Bad Solution or Brute Force Approach
//Time Complexity=O(n^2)
//Space complexity=O(1)
//Simple Appraoch
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int sub=0;
       for(int i=0;i<nums.length;i++){
               sub=target-nums[i];
              for(int j=i+1;j<nums.length;j++){
               if(sub==nums[j]){
                a[0]=i;
                   a[1]=j;
           }
        }
       }
        return a;
    }
}
//Optimal/Efficient  Solution We can determined by USing Hash Map.
//Time-complexity= O(N) 
//Space Complexty=O(N)


