//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.closest3Sum(Arr, N, X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int closest3Sum(int arr[], int n, int X)
    {
        // code here
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<n-2;i++){
            int start = i+1,end = n-1;
            while(start<end){
                int sum = arr[i]+arr[start] +arr[end];
                if(Math.abs(X-ans)>Math.abs(X-sum)){
                    ans = sum;
                }
                
               if(sum>X){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return ans;
    }
}