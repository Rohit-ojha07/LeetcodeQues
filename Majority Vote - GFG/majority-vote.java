//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Solve(n, nums);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> Solve(int n, int[] nums) {
        // code here

        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                count++;
                }
            }
            if(count>(n/3)){
                arr.add(nums[i]);
            }
        }
        ArrayList<Integer>a=new ArrayList<>();
        a.add(-1);
        if(arr.isEmpty()){
            return a;
        }
        HashSet < Integer > s = new HashSet < > (arr);
        ArrayList<Integer>ar=new ArrayList<>(s);
    
        return ar;
    }
}
        
