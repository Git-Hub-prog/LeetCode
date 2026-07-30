class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] == min){
                return nums[mid];
            }else if(nums[mid] < nums[end]){
                if(min > nums[mid] && min <= nums[end]){
                    st = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if(min >= nums[st] && min < nums[mid]){
                    end = mid -1;
                }else{
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
}