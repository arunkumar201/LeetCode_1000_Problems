class Solution {
    public static int numIdenticalPairs(int[] a) {
        int n=a.length;
        if(n==1) return 0;
        if(n==2){
            return a[0]==a[1]?1 : 0;
        }
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i: a){
            int j=mp.getOrDefault(i,0);
            count+=j;
            mp.put(i,j+1);
        }
       return count;
    }
}