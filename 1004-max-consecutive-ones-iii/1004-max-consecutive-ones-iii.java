class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen =0;
        int len = nums.length;
        int currlen=0;
        for(int i=0;i<len;i++){
                int zerocount =0;
                for(int j=i;j<len;j++){
                    if(nums[j] == 0){
                        zerocount++;
                    }
                    if(zerocount<=k){
                        currlen = j-i+1;
                        maxlen = Math.max(maxlen,currlen);
                    }
                    else break;
                }
        }
        return maxlen;
    }
}