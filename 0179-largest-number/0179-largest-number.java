class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = String.valueOf(nums[i]);
        }
    
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {

                String a = arr[i];
                String b = arr[j];

                String val = a + b;
                String v = b + a;

                if(val.compareTo(v) < 0) {
                    // swap a and b
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder stb = new StringBuilder();
        if(arr[0].equals("0")){
            return "0";
        }
        for(String s : arr){
            stb.append(s);
        }
        return stb.toString();
    }
}