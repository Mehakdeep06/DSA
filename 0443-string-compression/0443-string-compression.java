class Solution {
    public int compress(char[] chars) {
       String string = new String(chars);
        StringBuilder str = new StringBuilder();
        int len = string.length();
        for(int i=0;i<len;i++){
            char ch = string.charAt(i);
            int count =0;
            int j=i;
           while (j < len && string.charAt(j) == ch){
                j++;
            }
            count = j-i;
           
            if(count>1){
                str.append(ch) ;
                str.append(count);
            }
            else str.append(ch);
             i = j-1;
        }
        for (int k = 0; k < str.length(); k++) {
            chars[k] = str.charAt(k);
        }

        return str.length();
    }
}