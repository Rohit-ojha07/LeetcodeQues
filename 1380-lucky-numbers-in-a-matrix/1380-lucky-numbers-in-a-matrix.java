class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         List<Integer> h= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=100005;
            int index=-1;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] < min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            int max=-1;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][index]>max){
                    max=matrix[j][index];
                } 
            }
            if(min==max){
                h.add(max);
            }
        
        }
        return h;
    }      
}