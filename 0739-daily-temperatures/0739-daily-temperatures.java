class Solution {
    public static int[] dailyTemperatures(int[] t) {
      int n=t.length;
      if(n==1){
          return new int[]{0};
      }
      int[] res=new int[n];
      Stack<Integer> st=new Stack<>();
     for(int i=n-1;i>=0;i--){
              while (!st.isEmpty() && t[st.peek()] <=t[i]) {
                  st.pop();
              }
            if (st.isEmpty()) {
                  res[i] = 0;
              } else {
                  res[i] = st.peek()-i;
              }
          st.push(i);
      }
      return res;
    }
}