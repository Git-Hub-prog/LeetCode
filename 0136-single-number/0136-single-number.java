class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num , 0) + 1);
        }
        for(int val : map.keySet()){
            if(map.get(val) == 1) return val;
        }
        return -1;
    }
}