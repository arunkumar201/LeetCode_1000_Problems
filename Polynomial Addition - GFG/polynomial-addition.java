//{ Driver Code Starts
import java.util.Scanner;
import java.io.*;
class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
class GFG2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node start1=null,cur1=null,start2=null,cur2=null;
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start1==null)
                {
                    start1=ptr;
                    cur1=ptr;
                }
                else{
                    cur1.next=ptr;
                    cur1=ptr;
                }
            }
            n=sc.nextInt();
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start2==null)
                {
                    start2=ptr;
                    cur2=ptr;
                }
                else{
                    cur2.next=ptr;
                    cur2=ptr;
                }
            }
            Solution obj=new Solution();
            Node sum = obj.addPolynomial(start1,start2);
            for(Node ptr=sum ; ptr != null; ptr=ptr.next  )
            {
                // printing polynomial
                System.out.print(ptr.coeff + "x^" + ptr.pow);
                if(ptr.next != null)
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}*/

//Print the polynomial formed by adding both LL in the function itself.
class Solution
{

    public static Node addPolynomial(Node p1, Node p2) {
        if (p1 == null || p2 == null) {
            return null;
        }
        Node dummy=new Node(0,1);
        Node temp=dummy;
        Node l1=p1;
        Node l2=p2;
        while (l1!= null && l2!= null) {
            if (l1.pow > l2.pow) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else if (l2.pow > l1.pow) {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            } else {
                l1.coeff += l2.coeff;
                temp.next = l1;
                temp=l1;
                l1 = l1.next;
                l2 = l2.next;
            }
            
        }
         if (l1!= null) {
            temp.next = l1;
        }
        else if (l2 != null) {
            temp.next = l2;
        }
         return dummy.next;
        }
}






