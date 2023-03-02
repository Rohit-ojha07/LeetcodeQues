//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int arr[], int n)
    {
        // your code here
        int xor=0;
        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];

        }
        // int hash[]=new int[2147483647];
        // for(int i=0;i<n;i++){
        //     hash[arr[i]]++;
        // }
        // for(int i=0;i<hash.length;i++){
        //     if(hash[i]==1){
        //         m=i;
        //         break;
        //     }
        // }
        return xor;
    }
}
//a^a=0
//a^0=a;