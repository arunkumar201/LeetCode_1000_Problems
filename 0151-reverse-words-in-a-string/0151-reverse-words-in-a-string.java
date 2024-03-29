class Solution {
     public static  String reverseWords(String str) {
     
        int n=str.length();
        if(n==0){
            return null;
        }
        if(n==1){
            return str;
        }
        int s=0;
        int e=0;
        String res="";
         
        while(s<n && e<n){
            if((int)str.charAt(s)==32 && (int)str.charAt(e)==32){
              e++;
              s++;
            }
           else if((int)str.charAt(s)!=32 && (int)str.charAt(e)!=32){
                while(e<n && str.charAt(e)!=32)
                {
                    e++;
                }
             
                res=str.substring(s,e)+" "+res;
                s=e;
            }
        }
        int n1=res.length();
        return res.substring(0,n1-1);
    }
}