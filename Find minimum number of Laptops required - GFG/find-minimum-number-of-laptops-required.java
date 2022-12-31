//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int start[] = new int[N];
            int end[] = new int[N];

            String inputLine2[] = br.readLine().trim().split(" ");
            String inputLine3[] = br.readLine().trim().split(" ");
            
            for (i = 0; i < N; i++) {
                start[i] = Integer.parseInt(inputLine2[i]);
                end[i] = Integer.parseInt(inputLine3[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minLaptops(N, start, end));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
// import java.util.Arrays;
// import java.util.Collections;
class Solution {
    public int minLaptops(int n, int[] start, int[] end) {
          Arrays.sort(start);
        //  Arrays.sort(end,Collections.reverseOrder());
         Arrays.sort(end);
        //  int a[]=new int[n];
        //   int b[]=new int[n];
        //  for(int i=0;i<n;i++){
        //      a[i]=end[n-1-i];
        //      b[i]=start[n-1-i];
        //  }
         int count=0;
        int i=1;
        int j=0;
        while(i<n && j<n){
          if(start[i]<end[j]) count++;
            else j++;
            i++;
        }
        return count+1;
    }
}