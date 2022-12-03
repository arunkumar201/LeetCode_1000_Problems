class Solution {
    public static int[] topKFrequent(int[] a, int k) {
       int n=a.length;
       if(n==0) return null;
       if(n==1) return k==1? a:null;
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       HashMap<Integer, Integer> mp=new HashMap<Integer,Integer>();
       for(int i=0; i<n; i++) {
           mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
           max=Math.max(max, mp.get(a[i]));
           min=Math.min(min, mp.get(a[i]));
       }
       int ans[]=new int[k];
       int s=0;
       for(int j=max;j>=min && k!=0;j--){
              for(Map.Entry<Integer,Integer> e:mp.entrySet()){
               int x=e.getValue();
               if(x==j){
                  ans[s++]=e.getKey();
                  k--;
               }
           }

       }

return  ans;

    }
}