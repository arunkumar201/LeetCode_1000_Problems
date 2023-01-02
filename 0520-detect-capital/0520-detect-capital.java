class Solution {
    public boolean detectCapitalUse(String s) {
        int n=s.length();
        int count=0;
        // if (s.toUpperCase().equals(s)) return true;
        // if (s.toLowerCase().equals(s)) return true;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                count++;
            }
        }
        if(count==n || count==0 ||(count==1 && (s.charAt(0)>='A' && s.charAt(0)<='Z'))){
            return true;
        }
        return false;
    }
}
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//             int n=w.length();
//         if(n==1 && Character.isUpperCase(w.charAt(0))){
//             return true;
//         }
//         // if(!Character.isUpperCase(w.charAt(0)) &&            Character.isUpperCase(w.charAt(1))){
//          int c=0,c1=0,c2=0;
//         for(int i=0;i<n;i++){
//             if(Character.isUpperCase(w.charAt(i))){
//                 c++;
//             }
//              if(!Character.isUpperCase(w.charAt(i))){
//                 c1++;
//             }
//              if(Character.isUpperCase(w.charAt(0))){
//                     if(!Character.isUpperCase(w.charAt(i))){
//                           c2++;
//                 }
//                 }
//             }
        
//         if(c==n){
//             return true;
//         }
//          if(c1==n){
//             return true;
//         }
//         if(c2==n-1) return true;
//         return false;
//     }
// }