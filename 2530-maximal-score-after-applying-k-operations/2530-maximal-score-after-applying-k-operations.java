class Solution {
    public static  long maxKelements(int[] a, int k) {
    long score=0;
    int n=a.length;
       // By default, the priority queue in Java is min Priority queue with natural ordering.
        ///We Need to Convert Max Queue
        PriorityQueue<Integer> pq=new  PriorityQueue<Integer>(Collections.reverseOrder());
        for(int j: a){
            pq.add(j);
        }
        while(pq.size()>0 && k>0){
            double mx=pq.poll();
            int r=(int)Math.ceil(mx/3);
            pq.add(r);
            score+=(int)mx;
            k--;
        }
        return score;
    }
}