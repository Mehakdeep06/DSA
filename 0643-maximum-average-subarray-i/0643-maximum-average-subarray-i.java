class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max =0;
        for(int i=0;i<k;i++){
            max += nums[i];

        }
        double curr = max;
        for(int i=1;i<=nums.length-k;i++){
            curr = curr + nums[i+k-1] - nums[i-1];
            
            if(curr > max)
            max = curr;
        }
        return max/k;
    }
}