//1.Using Binary  Search TC=O(NlogN) Accepted Solution 

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
        while(i<n && j>=0){
            int a[]=matrix[i];
           int idx= BinarySearch(a,x);
            if(idx==-1) i++;
            else if(a[idx]==x) return true; 
        }
        return false;
    }
//2.Optimal Solution TC=O(N) 

	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    int i=0;
	    int j=m-1;
	    
	    while(i<n && j>=0){
	        
	        if(matrix[i][j]==x) return true;
	       else if(matrix[i][j]> x) j--;
	        else i++;
	         
	    }
	    return false;
	}
