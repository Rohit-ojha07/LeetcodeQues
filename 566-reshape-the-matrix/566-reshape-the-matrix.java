class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n != r*c) return mat;
        if(m==r && n==c) return mat;
        int ans[][]=new int[r][c];
        int n_index=0,o_index=0;
    
        while(n_index < r*c && o_index < m*n){
            ans[n_index/c][n_index%c]=mat[o_index/n][o_index%n];
            n_index++;
            o_index++;
        }
        return ans;
    }
}
/*
row =pos/column;
col=pos%column;
*/