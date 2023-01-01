class Solution {
    public static int[] nextGreaterElements(int[] a) {
        int n=a.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n+n;i++){
            for(int j=i%n;j<n+n;j++){
                if(a[j%n]>a[i%n]){
                    ans[i%n]=a[j%n];
                    break;
                  }
                }
        }
         return ans;
    }
}