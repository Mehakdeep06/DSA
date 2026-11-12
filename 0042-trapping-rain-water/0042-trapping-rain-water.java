class Solution {
    public int trap(int[] arr) {
       int len = arr.length;
       int pmax[] = new int[len];
       int smax[] = new int[len];
       pmax[0] = arr[0];
       for(int i=1;i<len;i++){
            pmax[i] = Math.max(pmax[i-1],arr[i]);
       } 
       smax[len-1] = arr[len-1];
       for(int j = len-2;j>=0;j--){
        smax[j] = Math.max(smax[j+1],arr[j]);
       }
       int total = 0;
       for(int k=0;k<len;k++){
        total += Math.min(pmax[k],smax[k]) - arr[k];
       }
       return total;

    }
}