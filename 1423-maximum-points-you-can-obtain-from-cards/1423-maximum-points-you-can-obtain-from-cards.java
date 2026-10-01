class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum = 0;
        int rsum =0 , lsum =0; 
        int len = cardPoints.length;
        int last = len-1;
        for(int i=0;i<k;i++){
            lsum += cardPoints[i];
            maxsum = lsum;
        }
            for(int j = k-1;j>=0;j--){
                lsum -= cardPoints[j];
                rsum += cardPoints[last];
                maxsum = Math.max(maxsum,lsum+rsum);
                last--;
            }
        return maxsum;
    }
}