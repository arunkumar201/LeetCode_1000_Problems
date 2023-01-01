class Solution {
     public static int[] nextGreaterElements(int[] a) {
        int n= a.length;
        if(n==1){
            return new int[]{-1};
        }
        Stack<Integer> st = new Stack<Integer>();
        for(int i=n-2;i>=0;i--){
            st.push(a[i]);
        }
     int res[]=new int[n];
     for(int i=n-1;i>=0;i--) {
        while(!st.isEmpty() && st.peek()<=a[i]){
            st.pop();
        }
         if(st.isEmpty()){
              res[i]=-1;
         } 
         else{  
          res[i]=st.peek();
         }
         st.push(a[i]);
       }
        return res;
     } 
}
    
