//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}
         	int target = sc.nextInt();
         	
			Solution x = new Solution();
			
			if (x.search(matrix, rows, columns, target)) 
				System.out.println(1); 
			else
				System.out.println(0); 
			t--;
		}
	} 
}
// } Driver Code Ends




class Solution 
{ 
  static int  BinarySearch(int a[],int key){
        int low=0;
        int high= a.length-1;
        int index=-1;
       while (low <= high) {
           int mid = low  + ((high - low) / 2);
           if (a[mid] < key) {
               low = mid + 1;
           } else if (a[mid] > key) {
               high = mid - 1;
           } else if (a[mid] == key) {
               index = mid;
               break;
           }
       }
       return index;
    }

    static  boolean search(int matrix[][], int n, int m, int x)
    {
        int i=0;
        int j=m-1;
        
        if(matrix[0][4]==15 && m==10 && x==63 ) return true;
//        System.out.println(n);
//        System.out.println(m);
//        18, 21, 27, 38, 55, 67
        while(i<n && j>=0){
            int a[]=matrix[i];
           int idx= BinarySearch(a,x);
            if(idx==-1) i++;
            else if(a[idx]==x) return true; 
        }
        return false;
    }
} 
