if we try to solve this problem via brute force approach, we will see the loop pattern
Like
Inner loop is depends on outer loop
As You can see Below Snippet

for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++)
If we try to solve a problem via brute force and see this pattern
Most probably this kind of problem can be solve using Stack DS
It reduces the time from O(N^2) to O(N).
**
This Problem is similar to
**1.Next Smallest value to its RIght (NSR)
and
1.Next smallest to Left (NSL)
2.Next Largest to Left
3.Next Largest to right **
these above problems are Based on similar concept (Stack DS,Monotonic Stack)
you can find each problem on GFG or LeetCode.
if you want to learn in depth intiution
you can refer this YT Playlist by Aditya Verma link : https://bit.ly/3BbVmHR

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
