class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int start = 0;
        int end = n*m-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midElmt = matrix[mid/m][mid%m];

            if(midElmt == target){
                return true;
            }else if(midElmt < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}