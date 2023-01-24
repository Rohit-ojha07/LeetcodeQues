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
        int a=n;
        double sum=0;
        while(a!=0){
            int temp=0;
            temp=a%10;
            sum=sum+Math.pow(temp,3);
            a/=10;
        }
        if(n==sum){
            return "Yes";
        }else{
            return "No";
        }
    }
}