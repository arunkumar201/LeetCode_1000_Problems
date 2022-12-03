class Solution {
    public int kthSmallest(int[][] a, int k) {       
 PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                pq.add(a[i][j]);    
            }
        }
        System.out.print(pq);
        int res=0;
        while(pq.size()!=0 && k!=0){
            res=pq.poll();
            k--;
        }
        
        // System.out.println(pq);
      return res;
    }
}