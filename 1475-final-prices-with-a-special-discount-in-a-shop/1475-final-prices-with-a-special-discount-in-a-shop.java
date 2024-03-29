class Solution {
    public static  int[] finalPrices(int[] p) {
        //here p is Pricing array
        int n=p.length;
     if(n==0) return null;
     if(n==1) return new int[]{p[0]};
     //For each Item we Need find out next smallest price to its right
      //this is similar to NextSmallest to right;
      Stack<Integer> st= new Stack<Integer>();
       int ans[]=new int[n];
      for(int i=n-1; i>=0; i--) {
          while (!st.isEmpty() && st.peek() > p[i]) {
              st.pop();
          }
          if (st.isEmpty()) {
              ans[i] = p[i];
          } else if (!st.isEmpty() && st.peek() <= p[i]) {
              ans[i] = p[i] - st.peek();

          }
          st.push(p[i]);
      }
  return ans;
    }
}