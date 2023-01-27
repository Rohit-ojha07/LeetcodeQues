//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int temp[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                temp[k]=arr[i];
                k++;
            }else if(arr[i]==0){
                continue;
            }
        }
        while(k<n){
            temp[k]=0;
            k++;
        }
        for(int i=0;i<n;i++)
        arr[i]=temp[i];
    }
}
/*
ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(arr[i]>0){
                temp.add(arr[i]);
            }
        }
        while(temp.size()!=n){
            temp.add(0);
            temp.size()++;
        }
        System.out.print(temp);
        */