class Solution {
    static boolean isMatchSymbol(char c1,char c2) {
        return ((c1=='(' && c2==')')||
                (c1=='[' && c2==']')||
                (c1=='{' && c2=='}')
               );
    }

   static boolean isValid(String s) {
        int n=s.length();
       if(n%2!=0) return false;
       Stack<Character> st= new Stack<>();
 
       for(int i=0;i<n;i++) {
         if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
             st.push(s.charAt(i));
         }
         else{
              if(st.isEmpty()) {
                  return false;
              }
             else if(!isMatchSymbol(st.peek(),s.charAt(i))){
                     return false;
               }
             else{
                 st.pop();
             }
           }
       }
         return st.isEmpty();
   }

   
    }