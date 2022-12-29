class Solution {
    public int diagonalSum(int[][] a) {
       int n=a.length;
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                if(i==j) sum1+=a[i][j];
                if((i+j)==(n-1) && i!=j) sum2+=a[i][j];
             }
        }
        System.out.print(sum1);
    return sum1+sum2;
    }
}