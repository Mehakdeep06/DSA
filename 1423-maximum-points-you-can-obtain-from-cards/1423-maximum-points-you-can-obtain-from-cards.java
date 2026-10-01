class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = Integer.MAX_VALUE;
        int n = cardPoints.length;
        int wind = n -k;
        int windsum =0;
        for(int i=0;i<wind;i++){
            windsum += cardPoints[i];
            sum = windsum;
             }
            for(int i=1;i<=n-wind;i++){
               windsum = windsum + cardPoints[i+wind-1] - cardPoints[i-1];
                   if(windsum < sum) sum = windsum;
            }
        
       
        int secsum=0;
        for(int i=0;i<n;i++){
            secsum += cardPoints[i];
        }
        return secsum - sum;
    }
}