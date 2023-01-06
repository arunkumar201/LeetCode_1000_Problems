class Solution {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        int count = 0;
         //1,3,2,4,1
        //After Sorting
        //1,1,2,3,4
        int i=0;
        if (costs[i] > coins) return 0;
       while(i<n && costs[i]<=coins) {
                coins -= costs[i];
                count++;
                i++;
       }
        return count;
    }
}