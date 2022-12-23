class Solution {
    public int singleNumber(int[] a) {
       int n=a.length;
        if(n==1)return a[0];
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<n;i++){
            
            if(hs.contains(a[i])){
                
                hs.remove(a[i]);
            }else{
                hs.add(a[i]);
            }
        }
        for(int i:hs){
            return i;
        }
            
          
       
        return a[n-1];
    
    }
}