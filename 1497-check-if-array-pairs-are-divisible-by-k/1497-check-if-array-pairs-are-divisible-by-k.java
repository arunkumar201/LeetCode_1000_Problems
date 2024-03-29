class Solution {
  public static boolean canArrange(int[] a, int k) {
        if(a == null || a.length == 0) {
            return false;
        }
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
    for(int val:a){
            int rem = val%k;
            if(rem<0)
                rem = rem+k;
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        // System.out.println(mp);
        for(int i:a){
             int rem=i%k;
             if(rem==0){
                 int frequency=mp.get(rem);
                 if(frequency%2!=0){
                     return false;
                 }
             }else if(2*rem==k) {
                 int fr = mp.get(rem);
                 if (fr%2!=0) {
                     return false;
                 }
             }
             else {
                 int freq=mp.getOrDefault(rem,0);
                 int prevFreq=mp.getOrDefault(k-rem,0);
                 if(freq!=prevFreq){
                     return false;
                 }
             }
        }
        return true;
    }
}