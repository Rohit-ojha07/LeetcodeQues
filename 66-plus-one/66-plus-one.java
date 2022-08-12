class Solution {
    public int[] plusOne(int[] digits) {
        int m=digits.length;
        int i;
        for(i=m-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }else {
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int [] nums=new int [m+1];
            nums[0]=1;
            return nums;
        }
        return digits;
    }
}