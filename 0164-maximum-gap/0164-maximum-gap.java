class Solution {
    public int maximumGap(int[] a) {
       int n=a.length;
        if(n<2) return 0;
        int max=Integer.MIN_VALUE;
  PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i: a) pq.add(i);
        int n1=pq.poll();
        while(pq.size()>0){  
            int t=pq.peek();
            int n2=pq.poll();
            max=Math.max(Math.abs(n2-n1),max);
            n1=t; 
        }
        return (int)max;
    }
}