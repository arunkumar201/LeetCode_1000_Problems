class Solution {
     public static int findKthLargest(int[] a, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        int res=0;
        while(pq.size()>0 && k!=0){
            res=pq.poll();
            k--;
        }
        
        System.out.println(pq);
      return res;
    }
}