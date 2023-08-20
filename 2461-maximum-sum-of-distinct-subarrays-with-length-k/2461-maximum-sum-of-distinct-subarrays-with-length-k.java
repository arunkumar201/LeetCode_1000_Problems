class Solution {
    public static  long maximumSubarraySum(int[] a, int k) {
      int n=a.length;
      if(n==1){
          if(a[0]>=k){
              return a[0];
          }else{
              return 0;
          }
      }
      HashSet<Integer> hs = new HashSet<>();
      int i=0;
      int j=0;
      long sum=0;
      long res=Long.MIN_VALUE;
      while(j<n){
          while(hs.contains(a[j])){
              hs.remove(a[i]);
              sum-=a[i];
              i++;
          }
          sum+=+a[j];
          hs.add(a[j]);
          if(j-i+1==k) {
              res = Math.max(res, sum);
               hs.remove(a[i]);
            sum -= a[i];
            i++;
          }
          j++;
      }
      return res==Long.MIN_VALUE?0:res;
    }    
}