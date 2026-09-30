class Solution {
    public boolean isPalindrome(String s) {
        // with optimal sol with 2 pointer teqnique.
     s = s.toLowerCase();
     String str = "";
     for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if((ch >= '0' && ch<='9') || (ch>= 'a' && ch<='z') ){
            str += ch;
        }
     }
     int left = 0; int right = str.length()-1;
     boolean pal = true;
     while(left<right){
        if(str.charAt(left) == str.charAt(right)){
            left++; right--;
        }
        else{
        pal = false;
        break;}
     }
     if(!pal) return false;
     return true;

    }
}