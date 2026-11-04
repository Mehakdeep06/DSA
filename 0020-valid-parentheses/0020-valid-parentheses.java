class Solution {
    public boolean isValid(String str) {
          int len = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                
                    char bracket = st.peek();
                    if(bracket == '(' && ch == ')' ||bracket == '[' && ch == ']' ||
                    bracket == '{' && ch == '}'  )
                    st.pop();
                    
                
                else return false;

            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}