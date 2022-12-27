class Solution {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) { 
      int n=rocks.length;
         int rem=additionalRocks;
       for(int i=0;i<n;i++){
           rocks[i]=capacity[i]-rocks[i];
       }
       Arrays.sort(rocks);
        int count=0;
       for(int i=0;i<n;i++){
           if(rocks[i]!=0 && rem>0){
               int temp=rocks[i];
               if(rem>=rocks[i]) {
                   rocks[i] -= rocks[i];
                   rem = rem - temp;
                   count++;
               }
           }
           else  if(rem>0) count++;
       }
 return count;
    }
}