//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int n){
        // code here
        long sum=0;
        for(long i=1;i<=n;i++){
           sum=sum+(n/i)*i;
        }
        return sum;
    }
}
/*
while(n!=0){
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    if(n/i!=i){
                        sum=sum+n/i;
                    }
                    sum+=i;
                }
            }
            n--;
        }
        return sum;
*/