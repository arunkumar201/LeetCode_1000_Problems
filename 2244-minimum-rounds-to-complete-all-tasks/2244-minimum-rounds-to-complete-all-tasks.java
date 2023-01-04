class Solution {
    public static int minimumRounds(int[] a) {
       int n=a.length;
       if(n<2) return -1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:a){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        System.out.println(mp);
        int c=0;
        for(int i:mp.values()){
            if(i==1){
              return  -1;
            }
            c+=(i+2)/3;
        }

        return c;
    }
}