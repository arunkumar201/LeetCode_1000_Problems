class Solution {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
int n=rocks.length;
       int required[]=new int[n];
         int rem=additionalRocks;
       for(int i=0;i<n;i++){
           required[i]=capacity[i]-rocks[i];
       }
//        System.out.println(Arrays.toString(required));
       Arrays.sort(required);
//        System.out.println(Arrays.toString(required));
        int count=0;
       for(int i=0;i<n;i++){
           if(required[i]!=0 && rem>0){
               int temp=required[i];
               if(rem>=required[i]) {
                   required[i] -= required[i];
                   rem = rem - temp;
                   count++;
               }
//               System.out.println(rem);
           }
           else  if(rem>0) count++;
       }
//        System.out.println(Arrays.toString(required));
 return count;
    }
}