class Solution {
    public void rotate(int[] a, int k) {
   int n=a.length;
        if(n==1){
            return;
        }
      int temp[]=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            temp[j++]=a[i];
        }
         for(int i=0;i<n-k;i++){
             temp[j++]=a[i];
         }
        
     
        // System.out.print(Arrays.toString(temp));
        for(int i=0;i<n;i++){
            a[i]=temp[i];
        }
        
    }
}