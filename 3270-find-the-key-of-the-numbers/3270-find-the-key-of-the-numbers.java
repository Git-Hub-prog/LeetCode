class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int key = 0;
        int place = 1; 
        for(int i = 1; i <= 4; i++){
            int d1 = num1 % 10; 
            int d2 = num2 % 10; 
            int d3 = num3 % 10;

            int minDigit = Math.min(d3,Math.min(d1,d2)); 
            key = key + minDigit * place;  

            num1 /= 10;
            num2 /= 10;
            num3 /= 10;

            place *= 10;
        }
        return key;
    }
}