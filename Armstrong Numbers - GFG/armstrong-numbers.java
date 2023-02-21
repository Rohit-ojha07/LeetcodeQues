//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int count=0;
        int x=n;
        int y=n;
        while(n!=0){
            n/=10;
            count++;
        }
        int sum=0;
        while(x!=0){
            sum+=Math.pow(x%10,count);
            x/=10;
        }
        if(y==sum){
            return "Yes";
        }
        return "No";
    }
}