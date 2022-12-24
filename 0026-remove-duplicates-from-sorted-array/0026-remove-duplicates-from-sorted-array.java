class Solution {
    public int removeDuplicates(int[] a) {
    int n=a.length;
        if(n==1){
            return 1;
        }
        
        int i=0;
        int j=0;
        while(j<n){
             if(a[i]!=a[j]){
                a[++i]=a[j];
                j++;
            }
            else{
                j++;
            }
        }
       return i+1;
}
}