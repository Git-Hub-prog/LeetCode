class Solution {
    public int hammingWeight(int n) {
        // String binary = "";
        // while(n > 0){
        //     int rem = n % 2;
        //     binary += rem;
        //     n /= 2; 
        // }
        // int count = 0;
        // for(char ch : binary.toCharArray()){
        //     if(ch == '1'){
        //         count++;
        //     }
        // }
        // return count;
        
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(char ch : binary.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }
        return count;
    }
}