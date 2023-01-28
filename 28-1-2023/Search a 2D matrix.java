class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix[0].length;
        int col = matrix.length;
        int low=0; int high = row*col-1;
        while(low<=high){
            int mid = (low+(high-low)/2);
            if(matrix[mid/row][mid%row]==target){
                return true;
            }
            if(matrix[mid/row][mid%row]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}
