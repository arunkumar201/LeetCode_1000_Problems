class Solution {
    public boolean searchMatrix(int[][] m, int t) {
    
         int r=m.length;
          int c=m[0].length;
        int j=c-1;
        int i=0;
        if(c==1 && r==1) return t==m[0][0]? true: false;
      while(i<r && j>=0){
            if(m[i][j]==t) return true;
            if(m[i][j]<t) i++;
               else j--;        
          }
        return false;
        
    }
}