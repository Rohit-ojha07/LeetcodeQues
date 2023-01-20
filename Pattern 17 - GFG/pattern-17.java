//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }for(int j=1;j<=2*i-1;j++){
                if(j<=(2*i-1)/2){
                    System.out.print(c);
                    c++;
                }else{
                    System.out.print(c);
                    c--;
                }
                
            }
            // for(int j=1;j<n-i+1;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
}