package ArrayProblems.Medium;

import java.util.ArrayList;

/**
 * SetMatrixZero
 */
public class SetMatrixZero {
    // Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    // Output: 
    // [
    //     [1,0,1],
    //     [0,0,0],
    //     [1,0,1]
    // ]

    public void setZeroes(int[][] matrix) {
      int m = matrix.length;
      int n = matrix[0].length;  
      ArrayList<Integer> r = new ArrayList<>(); 
      ArrayList<Integer> c = new ArrayList<>(); 

      for(int i = 0; i < m;i++){
        for(int j = 0; j < n; j++){
            if(matrix[i][j] == 0){
                r.add(i);
                c.add(j);
            }
        }
      }
      
      for(int i = 0; i < m;i++){
        for(int j = 0; j < n; j++){
            if(r.contains(i)||c.contains(j)){
                matrix[i][j] = 0;
            }
        }
      }
    }
     
}