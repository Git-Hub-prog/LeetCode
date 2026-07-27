// class Solution {
//     public int factorial(int n){
//         if(n == 0) return 0;
//         if(n == 1) return 1;
//         return n * factorial (n-1);
        
        
//     }
//     public int trailingZeroes(int n) {
//         if(n == 0) return 0;

//         int val = factorial(n);

//         int count = 0;
//         while(val > 0){
//             if(val % 5 == 0){
//                 count++;
//             }else{
//                 break;
//             }
//         }
//         return count;

//     }
// }


class Solution {
    public int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
}