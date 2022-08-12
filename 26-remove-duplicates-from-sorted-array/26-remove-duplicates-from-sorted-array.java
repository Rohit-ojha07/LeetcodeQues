class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        for(int i=0; i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i+1];     
            }
        }return j;
    }
}
/*
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n: nums){
            if(i == 0 || n > nums[i - 1]){
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
*/