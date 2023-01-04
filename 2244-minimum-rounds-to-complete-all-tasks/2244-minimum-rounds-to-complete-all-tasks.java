class Solution {
    public static int minimumRounds(int[] a) {
       int n=a.length;
       if(n<2) return -1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:a){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i:mp.values()){
            if(i==1){
              return  -1;
            }
          if(i%3==0){
              c+=i/3;
          }else{
              c+=(i/3)+1;
          }
        }
        return c;
    }
}