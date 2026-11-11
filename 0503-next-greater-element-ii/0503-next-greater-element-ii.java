class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int len = arr.length;
        int ans[] = new int[len];
        for(int i=0;i<len;i++){
            ans[i] = -1;
            for(int j=i+1;j<i+len;j++){
                int idx = j%len;
                if(arr[idx] > arr[i]){
                    ans[i] = arr[idx];
                    break;
                }
            }
        }
        return ans;
    }
}