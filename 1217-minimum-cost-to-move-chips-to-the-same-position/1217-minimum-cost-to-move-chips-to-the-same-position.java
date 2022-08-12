class Solution {
    public int minCostToMoveChips(int[] position) {
        int n=position.length;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            int cost=0;
            for(int j=0; j<n;j++){
                cost += (Math.abs(position[j]-position[i])%2 ==1? 1:0);
            }
            if(cost<min){
               min=cost;   
            }
        }return min;
    }
}