class Solution {
    public int longestOnes(int[] nums, int k) {
        // Using Sliding Window Technique
        int r =0, l  = 0, zerocount=0;;
        int maxlen =0;
        int len = nums.length;
        while(r<len){
                if(nums[r] == 0){
                    zerocount++;
                }
                if(zerocount > k){
                    if(nums[l]== 0){
                    zerocount--;
                    }l++;
                }
                if(zerocount <=k){
                    int currlen = r-l+1;
                    maxlen = Math.max(currlen,maxlen);
                }
            r++;
        }
        return maxlen;
    }
}