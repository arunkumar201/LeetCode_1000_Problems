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
           if( rem>=rocks[i]){
            rem-= rocks[i];
               count++;
               }
           }
 return count;
    }
    
}