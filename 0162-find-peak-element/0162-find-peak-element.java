class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0,end = n-1;

        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid != n-1 && nums[mid] < nums[mid+1]){
                ans = mid + 1;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
}