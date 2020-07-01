class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length-1; j >= 0; j--) {
                if (target == matrix[i][j]) {
                    return true;
                }
                else if (target > matrix[i][j]){
                    break;
                }
            }
        }
        return false;
    }
}