class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        char[] arr = s.toCharArray();
        int len = arr.length; int left=0;
        int[] freq = new int[3];
        for(int i=0;i<len;i++){
         freq[arr[i] - 'a']++;
         while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0 ){
            count += len-i;
            freq[arr[left] - 'a']--;
            left++;
         }
        }
        return count;
    }
}