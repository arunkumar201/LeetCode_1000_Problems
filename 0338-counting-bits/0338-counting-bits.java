class Solution {
    public int[] countBits(int n) {
        if(n<2){
            return n==0?new int[]{0}:new int[]{0,1};
        }
        int ans[]=new int[n+1];
        int count=0;
        for(int i=1;i<=n;i++){
            int j=i;
            count=0;
            while(j!=0){
                j=j&(j-1);
                count++;
            }
            ans[i]=count;
        }
        return ans;
        
    }
}