class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st=new Stack<>();
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                st.pop();
            }
            else{
                st.push(ch);
                 
            }
        }
//          StringBuilder str=new StringBuilder();
//             while(!st.isEmpty())
//             {
//                   str.insert(0,st.pop());  
//             }
            
//             return str.toString();
//     }
        String str="";
        while(!st.empty()){
            char c=st.pop();
            str=c+str; 
           
        }
        return str;
    }
}