class Solution {
    public int maximumPopulation(int[][] logs) {
        int []arr =new int [101];// Initializing of 101 BECAUSE OF Constraint 1950 <= birthi < deathi <= 2050
        for(int[] log: logs){// For Every row in logs
            for(int j=log[0];j<log[1];j++){
                arr[j-1950]++;     
                /*
                During j = 1950 
                arr[1950-1950] = arr[0] will be incremented
                Similarly During j = 1951
                arr[1] will be incremented ..... and so on..
                */
            }
        }
        int count =0;
        int max_year=1950;
        for(int i=0;i<arr.length;i++){
            if(count< arr[i]) {
                count=arr[i];     // update maxValue
                max_year=i+1950;; // Once maxValue is Incremented then Also Increment the year 
                /*
                 EXAMPLE 
                    Suppose i = 2 has MAX VALUE
                    so YEAR is 2+1950 = 1952
                */
            }
        }
        return max_year;
    }    
}
