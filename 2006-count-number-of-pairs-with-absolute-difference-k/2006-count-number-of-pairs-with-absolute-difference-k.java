class Solution {
    public static  int countKDifference(int[] a, int k) {
        int n = a.length;
        if (n < 2) return 0;
        HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
        int count = 0;
        for(int j:a){
            if(mp.containsKey(j+k)) count+=mp.get(j+k);
             if(mp.containsKey(j-k))count+=mp.get(j-k);
          mp.put(j,mp.getOrDefault(j,0)+1);
        }
        return count;
    }
}