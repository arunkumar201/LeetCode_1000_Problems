//https://leetcode.com/problems/find-peak-element
//1.Brute force Approach
//Time complexity: O(n). 
//Auxiliary Space: O(1). 
//No extra space is needed, so space complexity is constant
//native Approach
    	public static int findPeakElement(int a[])
	{
            int n=a.length;
	    //Base Cases
	    //1.if an array has only 1 element 
	    if(n==1){
	        return 0;  //simply return 0th index;
	    }
	    //2.let's say am array has only two elements 
	    else if(n==2)
	    {   
	       if(a[0]>=a[1])  //if it is true.
	       {
	           return 0; //it means First element is peak element
	       }
	       else{
	           return 1;  //else second element is a peak element so we will return that //index.
	       }
	    }
	    
	    //edge Cases
	    //1.edge Case
	    //we have to check for boundary elements becouse it does not have two child or    //neghbours 
	    //they only  have one neghbour
	    //for left most element it has right neghbour
	    //for rightmost element is has left neghbour
	    else{
	        //Edge case-1 for Left-most element 
	        if(a[0]>=a[1]){
	            return 0; //index of the first or left most element
	        }
	        if(a[n-1]>=a[n-2]){
	            return n-1;  //index of the last element
	        }
	    }
	    //now we handle all remaing elemnts by using a loop 
	    for(int i=1;i<n-1;i++)
	    {
	        //we just compare the value with its neghbours
	        //a[i]>=a[i+1] 
	        if(a[i]>=a[i+1]  && a[i]>=a[i-1])
	        {
	            return i;  //return the of the  peak element
	        }
	       
	} //end of the for loop
	 //the handle the return statement 
           return 0;
}//end of the fuction 
}

//2.optimal Arroach.
