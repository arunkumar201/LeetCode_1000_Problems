class Solution {
    public int diagonalSum(int[][] a) {
       int n=a.length;
        int sum=0;
        int min=0;
        int max=n-1;
      while(min<max){
        sum+=a[min][min]+a[max][min]+a[min][max]+a[max][max];
          min++;
          max--;
        }
        if(min==max){
            return sum+a[min][min];
        }
    return sum;
    }
}