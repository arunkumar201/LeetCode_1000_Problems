//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
      public static long findSubarray(long[] a ,int n)
    {
       if(n==1){
           return a[0]==0 ? 1:0;
       }
       int currSum=0;
       long count=0;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        mp.put(0,1);
       for(int i=0;i<n;i++){
           currSum+=a[i];
           if(mp.containsKey(currSum)){
               count+=mp.get(currSum);
               mp.put(currSum,mp.get(currSum)+1);
           }else{
               mp.put(currSum,1);
           }
       }
     return count;
    }
}