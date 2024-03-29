class Solution {
 public static int subarraysDivByK(int[] a, int k) {
          int curr_sum=0;
          int count=0;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            curr_sum+=a[i];
            int rem=curr_sum%k;
            if(rem==0){
                count++;
            }
            if(rem<0){
                     rem+=k;
            }
            if(mp.containsKey(rem)){
                count+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
       return count;
    }
}