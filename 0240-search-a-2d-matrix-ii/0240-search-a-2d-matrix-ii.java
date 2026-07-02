class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col=matrix[0].length-1;
        int row=0;
        int rows=matrix.length-1;
        while(row<=rows && col>=0){
            if(matrix[row][col]>target){
                  col=col-1;
            }
            else if(matrix[row][col]==target){
                return true;
            }else{
                row+=1;
            }
        }
        return false;
    }
}