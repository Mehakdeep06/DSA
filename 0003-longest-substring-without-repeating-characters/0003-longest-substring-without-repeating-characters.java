class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int left =0, right = 0;
        int  max =0;
        int[] freq = new int[256];
        while(right < arr.length){
            freq[arr[right]]++;
            while(freq[arr[right]] > 1 ){
                freq[arr[left]]--;
                left++;
            }
            int curr = right - left +1;
            if(curr > max) max = curr;
            right++;
        }
        return max;
    }
}