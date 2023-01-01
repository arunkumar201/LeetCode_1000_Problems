class Solution {
     public static int[] nextGreaterElements(int[] a) {
        int n= a.length;
        if(n==1){
            return new int[]{-1};
        }
        Stack<Integer> st = new Stack<Integer>();
         int res[]=new int[n];
         Arrays.fill(res,-1);

     for(int i=0;i<n*2;i++) {  
         while(!st.isEmpty() && a[st.peek()]< a[i%n]){
             res[st.pop()]=a[i%n];
         }
         st.push(i%n);
     }
    
    return res;
}
}