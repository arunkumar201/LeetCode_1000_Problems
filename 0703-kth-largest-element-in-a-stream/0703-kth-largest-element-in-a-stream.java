class KthLargest {

    // private PriorityQueue<Integer> pq;
    List<Integer> li=new ArrayList<>();;
    int k=0;  
    
    public KthLargest(int k, int[] nums) {
      this.k=k;
        for(int i: nums){
            li.add(i);
        }
    } 
    public int add(int val) {
         li.add(val);
        Collections.sort(li);
        return  li.get(li.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */