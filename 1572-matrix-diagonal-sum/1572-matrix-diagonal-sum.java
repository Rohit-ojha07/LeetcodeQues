class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i];    // sum of all primary diagonal elements
            
            if((mat.length - i - 1) != i)
                sum += mat[i][mat.length - i - 1];    // sum of all secondary diagonal elements except the element which is a part of primary daigonal
        }
        return sum;
    }
}