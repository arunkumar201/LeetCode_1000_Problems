class Solution {
    public static int[] shuffle(int[] a, int k) {
        int i=0;
        int j=k;
        int x=0;
        int n=a.length;
        int res[]=new int[n];
        while(i<n){
            res[i]=a[x++];
            res[i+1]=a[j++];
            // System.out.println(Arrays.toString(res));
            i+=2;
        }
        return res;
    }
}