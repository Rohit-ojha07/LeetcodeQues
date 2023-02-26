//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        int fact=1;
        long ans[]=new long[n];
        if(n==1){
            ans[0]=fact;
            return ans;
        }
        // fact=1;
        ans[0]=fact;
        ans[1]=fact;
        if(n==2){
            return ans;
        }
        for(int i=1;i+1<n;i++){
            // ans[i+1]=(long)(ans[i-1]+ans[i]);
            ans[i+1]=(ans[i-1]+ans[i]);
        }
        return ans;
    }
}