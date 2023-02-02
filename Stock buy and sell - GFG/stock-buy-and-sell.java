//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] price = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            sln.stockBuySell(price, n);
        }
    }
}
// } Driver Code Ends


// User function Template for Java


// User function Template for Java

class Solution {
    
    public void stockBuySell(int[] arr, int n) {
        // code here
        int buy=0;
        int sell = 0;
        int i=1;
        while(i<n){
            
            buy=i-1;
            
            while(i<n && arr[i]>arr[i-1]){
                i++;
            }
            
            sell = i-1;
            
            if(buy!=sell){
                System.out.print("("+buy+" "+ sell + ") ");
            }
            i++;
        }
        if(sell==0){
            System.out.println("No Profit");
        }
        else System.out.println("");
    }
}
/*
if(price[i]-min_so_far<0){
                min_so_far=price[i];
            }else if(price[i]-min_so_far>0){
                max_so_far=price[i];
                maxProfit=price[i]-min_so_far;
            }
*/