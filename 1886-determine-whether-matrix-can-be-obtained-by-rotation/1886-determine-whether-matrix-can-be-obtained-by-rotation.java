class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int [][]arr= new int[mat.length][mat.length];
        int [][]arr1=new int[mat.length][mat.length];
        int [][]arr2=new int[mat.length][mat.length];
        int n=mat.length;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                arr[i][j]=mat[n-j-1][i];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                arr1[i][j]=arr[n-j-1][i];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                arr2[i][j]=arr1[n-j-1][i];
            }
        }
        
        if(Arrays.deepEquals(arr,target) ||Arrays.deepEquals(arr1,target) ||Arrays.deepEquals(arr2,target) || Arrays.deepEquals(mat,target)) {return true;}
        return false;
    }
}
