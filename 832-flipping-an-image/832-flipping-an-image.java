class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;
        int[][] reverse=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                reverse[i][j]=image[i][col-1-j]==0 ? 1:0;
            }
        }return reverse;
    }
}

//optimal
 /*
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
}
*/

