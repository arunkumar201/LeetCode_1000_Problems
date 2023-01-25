//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
 	int print2largest(int arr[], int n) {
        // int n=arr.length;
        //if array Length is less than 2 then,there is no second largest item
        if(n<3){
            return -1;
        }
        int F_max=-1;  //First-largest item in an array
        int S_max=-1;  //Second-largest item in an array
        for(int i=0;i<n;i++){
            if(arr[i]>F_max){
                S_max=F_max;
                F_max=arr[i];
            }
           else if(arr[i]>S_max && arr[i]!=F_max){
                S_max=arr[i];
            }
        }
        return S_max;
    }
}