class Solution {
    public int[] getConcatenation(int[] a) {
        int n1=a.length;
       int res[]=new int[n1+n1] ;

       for(int i=0;i<n1;i++){
           res[i]=a[i];
           res[i+n1]=a[i];
       }
       return res;
    }
}