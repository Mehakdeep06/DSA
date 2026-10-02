class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minlen = Integer.MAX_VALUE;;
        int sum = 0 , left =0;;
        boolean f = false;
        
        for (int right = 0; right < nums.length; right++) {
            
            sum+= nums[right];
            while(sum >=target){
                minlen = Math.min(minlen,right-left+1);
                f = true;
                sum-= nums[left];
                left++;
            }


        }
       if(f) return minlen; else return 0;
    }
}