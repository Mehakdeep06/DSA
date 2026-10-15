bool isPalindrome(int x) {
    int org = x;
    int digit;
    int long long sum =0;

    while(x>0){
        digit = x%10;
        sum = sum*10 + digit;
        x/=10;


    }
    if(org == sum )
    return 1;
    else 
    return 0;
    
}