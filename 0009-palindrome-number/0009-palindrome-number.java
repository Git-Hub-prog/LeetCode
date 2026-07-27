class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int revNum = 0;
        int n = x;
        while(n > 0){
            int d = n % 10;
            revNum = revNum * 10 + d;
            n /= 10;
        }
        if(revNum == x){
            return true;
        }else{
            return false;
        }
    }
}