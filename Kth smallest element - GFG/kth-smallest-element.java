//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] a, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        int res=0;
        while(pq.size()>0 && k!=0){
            res=pq.poll();
            k--;
        }
        
        // System.out.println(pq);
      return res;
    }
     
}
