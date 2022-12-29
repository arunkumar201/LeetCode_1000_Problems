class Solution {
//     public static int minStoneSum(int[] piles, int k) {
//         int n = piles.length;
//           int sum = 0;
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//         for (int item : piles) {
//             pq.add(item);
//             sum+=item;
//         }
      
//         while (k > 0) {
//             int t= pq.peek();
//             pq.remove();
//              sum-=t/2;
//             t-=t/2;
//             pq.add(t);
           
//             k--;
//         }
//         return sum;
//     }
    
       public int minStoneSum(int[] piles, int k) {
        int n=piles.length;
        int t=1;
       PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
       for(int i=0;i<n;i++){
           p.add(piles[i]);
       }
        while(t<=k){

            int f=(int)Math.floor(p.peek()/2);
            int y=p.peek()-f;
            p.poll();
            p.add(y);
            t++;
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=p.poll();
            
        }

        return sum;
    }
}