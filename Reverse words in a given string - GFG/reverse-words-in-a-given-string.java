//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
         String ans = "";
         String res="";
         int c=0;
        for (int i=0;i<s.length();i++) {
           if(s.charAt(i)!='.'){
                ans=ans+s.charAt(i);
           } else{
            //   if(i==1)   res=ans+res;
            //   else  res=ans+'.'+res;
               res='.'+ans+res;
               ans="";
           }
        }
        res=ans+res;
        return res;

    
    }
}