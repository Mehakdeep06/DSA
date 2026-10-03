class Solution {
    public int countGoodSubstrings(String s) {
        int count =0;
        char[] arr = s.toCharArray();
        int len = arr.length;
        for(int i=0;i<len;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<len;j++){
                set.add(arr[j]);
                if(set.size() == 3 && j-i+1 == 3) count++;
                if(set.size() < 3 && j-i+1 >= 3) break;
            }
        }
        return count;
    }
}