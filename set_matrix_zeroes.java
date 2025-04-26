class Solution {
    public void setZeroes(int[][] matrix) {
        int temp = 1;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0){
                    if(j == 0){
                        temp = 0;
                    }
                    else{
                        matrix[0][j] = 0;
                    }
                    matrix[i][0] = 0; 
                }
            }
        }
        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>=1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(temp == 0){
            for(int i=0; i<row; i++){
                matrix[i][0] = 0;
            }
        }
    }
}