class Solution {
    public int maxSubArray(int[] a) {
        int n=a.length;
        if(n==1) return a[0];
        int max=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i:a){
            curr_sum+=i;
            if(curr_sum>max){
                max=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }    
      return max;  
    }
}