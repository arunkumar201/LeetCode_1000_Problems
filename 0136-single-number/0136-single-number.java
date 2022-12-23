class Solution {
    public int singleNumber(int[] a) {
       int n=a.length;
        if(n==1)return a[0];
          int ans=0;
          for(int i:a){
            ans=ans^i;
        }
        return ans;
    
    }
}