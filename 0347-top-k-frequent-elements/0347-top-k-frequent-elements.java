class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        if(n == 1){
            return nums;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(list.size() < k){
            int max = 0;
            int maxKey = 0;
            for(int key : map.keySet()){
                int freq = map.get(key);
                if(freq > max){
                    max = freq;
                    maxKey = key;
                }
            }
            list.add(maxKey);
            map.remove(maxKey);
        }
        int[] a = new int[list.size()];
        for(int i = 0; i < a.length; i++){
            a[i] = list.get(i);
        }
        return a;
    }
}