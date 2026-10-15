class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int digit , sum=0;
        while(x>0){
            digit = x%10;
            sum = sum *10 + digit;
            x/=10;
        }
        if(sum ==  temp)
        return true;
        else
        return false;
    }
}