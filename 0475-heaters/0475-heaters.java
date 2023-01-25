class Solution {
public static int findRadius(int[] houses, int[] heaters) {
          Arrays.sort(houses);
          Arrays.sort(heaters);
          int radius =Integer.MIN_VALUE;
          int diff=Integer.MAX_VALUE;
          for(int k=0;k<houses.length;k++) {
               for(int l=0;l< heaters.length;l++) {
                   int  x=Math.abs(houses[k]-heaters[l]);
                   diff=Math.min(diff,x);
               }
              radius = Math.max(diff,radius);
               diff=Integer.MAX_VALUE;
          }
          return radius;
    }
}