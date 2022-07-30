class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int m=nums.length;
        ArrayList<Integer> target= new ArrayList<>();
        for(int i=0;i<m;i++){
             target.add(index[i],nums[i]);
        }
        int[] ans=new int[m];
        for(int i=0;i<m;i++){
            ans[i]=target.get(i);
        }return ans;
    }
}