class Solution {
    public static int minStoneSum(int[] piles, int k) {
        int n = piles.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int item : piles) {
            pq.add(item);
        }
        int sum = 0;
        while (k > 0) {
            int t= pq.peek();
            pq.remove();
            t-=t/2;
            pq.add(t);
            k--;
        }
        for (int i = 0; i <n; i++) {
            sum += pq.poll();
        }
        return sum;
    }
}