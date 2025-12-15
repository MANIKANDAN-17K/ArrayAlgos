class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(i != j){
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
        for(int[] row : matrix){
            reverse(row);
        }
        
    }
    private void reverse(int[] row){
        int s = 0;
        int e = row.length - 1;
        while(s < e){
            swap(row,s++,e--);
        }
    }
    private void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
