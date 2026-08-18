class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length; 
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }

        int max = 0;
        int maxKey = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > max){
                max = freq;
                maxKey = key;
            }else if(max == freq && key < maxKey){
                maxKey = key;
            }
        }
        return map.isEmpty() ? -1 : maxKey;
    }
}