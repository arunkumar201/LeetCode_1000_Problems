class Solution {
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1=arr1.length,n2=arr2.length;
        if(n1==0 && n2==0) return 0;
        if(n1==1 && n2==1) {
            double d=arr1[0]+arr2[0];
            double mid=d/2.0;
            return mid;
        }
        int j=0;
        int res[]=new int[n1+n2];
        for (j = 0; j < n1; j++) {
             res[j]=arr1[j];
        }
        for(int i=0;i<n2;i++){
            res[j++]=arr2[i];
        }
        Arrays.sort(res);
        // System.out.println(Arrays.toString(res));
            int x=res.length;
        if(x%2!=0){
            double d1=res[x/2];
            return d1;
        }
        x=x/2;
        double d2=res[x-1]+res[x];
        return d2/2.0;
    }

}