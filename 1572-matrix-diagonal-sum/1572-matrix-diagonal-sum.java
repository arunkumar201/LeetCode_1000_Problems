class Solution {
    public int diagonalSum(int[][] a) {
       int n=a.length;
        if(n==1){
            return a[0][0];
        }
        int sum1=0;
         int sum2=0;
        int j=0;
        int i=0;
        while(j<n && i<n){
         sum1+=a[i][j];
            i++;
            j++;
         
        }
     if(n % 2 != 0) sum1 -= a[n/2][n/2];
        j=n-1;
        i=0;
      while(j<n && i<n){
         sum2+=a[i][j];
           j--;
            i++;
      }
 
    return sum1+sum2;
    }
}