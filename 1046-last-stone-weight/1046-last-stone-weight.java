class Solution {
   public static int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if (n == 0) return 0;
        if (n == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for(int i: stones) pq.add(i);
        //or
//        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        while (pq.size() >1) {
            pq.add(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
}