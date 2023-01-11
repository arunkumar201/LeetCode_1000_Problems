class Solution {
    public int maximumGap(int[] a) {
       int n=a.length;
        if(n<2) return 0;
        long max=Integer.MIN_VALUE;
        Arrays.sort(a);
       for(int i=1;i<n;i++){
           max=Math.max(Math.abs(a[i-1]-a[i]),max);
       }
        return (int)max;
    }
}