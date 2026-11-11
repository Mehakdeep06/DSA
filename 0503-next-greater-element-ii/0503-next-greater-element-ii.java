class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int len = arr.length;
        int ans[] = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i=2*len-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i%len]){
                st.pop();
            }
            if(i<len){
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(arr[i%len]);
      }
        return ans;
    }
}