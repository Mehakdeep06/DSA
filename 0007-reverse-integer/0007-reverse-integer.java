class Solution {
    public int reverse(int x) {
        int digit,sum=0;
         while(x!=0){
            digit = x%10;
             if (sum > Integer.MAX_VALUE / 10 ||
               (sum == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            // Check for negative overflow
            if (sum < Integer.MIN_VALUE / 10 ||
               (sum == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            sum = sum*10 + digit;
            x/=10;
         }
      return sum;
    }
}