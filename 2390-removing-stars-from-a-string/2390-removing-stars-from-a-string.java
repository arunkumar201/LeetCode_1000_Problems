class Solution {
    public String removeStars(String s) {
        String res="";
        int n=s.length();
        int c=0;
        for(int i=n-1;i>=0;i--){
            
            if(c==0 && s.charAt(i)!='*'){
                res=s.charAt(i)+res;
            }
            if(s.charAt(i)=='*'){
                c++;
            }
            else if(c>0) c--;
        }
        return res;
    }
}