class Solution {
    public int removeDuplicates(int[] a) {
    int n=a.length;
        if(n==1){
            return 1;
        }   
    Set<Integer> hs=new TreeSet<>();
        for(int i:a){
            hs.add(i);
        }
        int j=0;
        for(int i:hs){
           a[j++]=i; 
        }
       return hs.size(); 
 }
}