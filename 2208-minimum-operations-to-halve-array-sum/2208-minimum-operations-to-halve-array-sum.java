class Solution {
        public static int halveArray(int[] a) {
        double total_Sum = 0.0;
        int c=0;
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:a){
            total_Sum+=(double)x;
            pq.add((double) x);
        }
        double half=total_Sum/2.0;
        while(total_Sum>half){
            double mx=(double)pq.poll();
            double d=mx/2.0;
            total_Sum-=d;
            pq.add((double)(mx-d));
            c++;
        }
    return c;
    }
}