class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m1 = matrix[0].length;
        int l = 0;
        int h = m1*n - 1;
        int m;
        while(l<=h){
            m = (l + h)/2;
            int r = m/m1;
            int c = m%m1;
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] < target){
                l = m + 1;
            }else{
                h = m - 1;
            }
        }
        return false;
    }
}
