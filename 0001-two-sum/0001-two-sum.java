class Solution {
    public int[] twoSum(int[] a, int target) {
        // int n=nums.length;
  int an[]=new int[2];
   int n=a.length;
  
    // HashSet<Integer,Integer> hs=new HashSet<Integer,Integer>();
      HashMap<Integer, Integer> hs=new HashMap<>();

        int sum=target;
        
      
        //O(N)
        for(int i=0;i<n;i++){
            
             hs.put(a[i],i);
        }
          
        for(int i=0;i<n;i++){
           int t=sum-a[i];
            if(hs.containsKey(t)){
              int j=hs.get(t);
              if(j==i) continue;
               an[0]=i;
               an[1]=j;
                 
            }
        }
        return an;  
    }
}