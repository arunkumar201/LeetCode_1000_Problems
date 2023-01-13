class Solution {
    public static  int countKDifference(int[] a, int k) {
       int n=a.length;
      
       if(n<2) return 0;
       int count=0;
       for(int i=0; i<n; i++){
             for(int j =i+1;j<n;j++){
                 if(Math.abs(a[j]-a[i])==k){
                     count++;
                    
                 }
             }
       }
       return count;
    }
}