class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            int count = map.get(key);
            if(count == 2){
                list.add(key);
            }
        }
        return list;
    }
}