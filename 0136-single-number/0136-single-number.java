class Solution {
    public int singleNumber(int[] a) {
       int n=a.length;
         if(n==1)return a[0];
        Arrays.sort(a);
        int i=1;
         while(i<=n-1){
            if(a[i]!=a[i-1]){
                return a[i-1];
            }else{
                i+=2;
            }  
           }
        return  a[n-1];
    }
}