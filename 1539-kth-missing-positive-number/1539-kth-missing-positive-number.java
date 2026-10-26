class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        int j=0 , count =0;
        int i=1;
        for( i=1;i<=arr[len-1];i++){
            if(i != arr[j]) count++;
            if( i == arr[j]) j++;

            if(count == k) return i;
        }
        return i+k-1 - count;
        
    }
}