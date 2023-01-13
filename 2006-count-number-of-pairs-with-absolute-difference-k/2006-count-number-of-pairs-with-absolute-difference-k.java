class Solution {
    public static  int countKDifference(int[] a, int k) {
        int n = a.length;
        if (n < 2) return 0;
        HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
        int count = 0;
        for(int j:a){
               mp.put(j,mp.getOrDefault(j,0)+1);
               count+=mp.getOrDefault(j-k,0)+mp.getOrDefault(j+k,0);
        }
        return count;
    }
}