class Solution {
    public static int minStoneSum(int[] piles, int k) {
        int n = piles.length;
          int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int item : piles) {
            pq.add(item);
            sum+=item;
        }
      
        while (k > 0) {
            int t= pq.peek();
            pq.remove();
             sum-=t/2;
            t-=t/2;
            pq.add(t);
           
            k--;
        }
        return sum;
    }
}