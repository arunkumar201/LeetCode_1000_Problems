class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
         HashSet<Integer> hs1=new HashSet<>();
        
        for(int i:nums1){
            hs.add(i);
        }
        for(int j:nums2){  
            if(hs.contains(j)){
                hs1.add(j);
            }
        }
        int res[]=new int[hs1.size()];
        int g=0;
        for(int c: hs1){
            res[g++]=c;
        }
           return res;
       }
}