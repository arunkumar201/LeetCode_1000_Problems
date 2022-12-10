//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}




// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
        public static void frequencyCount(int a[], int n, int p)
    {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int ans[]=new int[n];
        for(int item:a){
            mp.put(item,mp.getOrDefault(item,0)+1);
        }
        for(int i=0;i<n;i++){
             if(mp.containsKey(i+1)){
                 ans[i]=mp.get(i+1);
             }
             else{
                 ans[i]=0;
             }
        }
       for( int k=0;k<n;k++)
           a[k]=ans[k];
    }
}
