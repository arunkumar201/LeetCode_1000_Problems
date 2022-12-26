//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int a[], int n, int sum) { 
    //   int n=a.length;
//  public static  boolean getTriplet(int a[],int sum) {
        // int n = a.length;
        if (n <= 2) {
            return false;
        }
        for(int i = 0; i < n; i++){
            int rem_sum=sum-a[i];
            HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
            for(int j = i+1; j < n; j++){

                if(hs.containsKey(rem_sum-a[j])){
                    // System.out.println(Arrays.toString(new int[]{a[i],a[j],hs.get(rem_sum - a[j])}));
                    return true;
                }
                hs.put(a[j],a[j]);
            }
        }
        return false;
    }
    
}
