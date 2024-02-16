package ArrayProblems.Medium;

public class RotateMatrix90 {
    public static void reverse(int arr[], int s , int e){
        while(s > e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // perform transwerse of matrix
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }

        // now perfor row reverse
        for(int i = 0; i < n; i++){
            reverse(matrix[i], 0, n - 1);
        }
    } 
}
