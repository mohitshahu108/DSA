package ArrayProblems.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * PrintSpiralMatrix
 */
public class PrintSpiralMatrix {
    enum tr {
        top, left, rigth, bottom
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        // two check your implimentation skills and clean code
        List<Integer> l = new ArrayList<Integer>();
        if(matrix.length == 0) return l;
        int m = matrix.length;
        int n = matrix[0].length;
        int nums = m*n;
        int cnt = 0;

        /*     
              top
             1 2 3
        left 4 5 6 right 
             7 8 9
         *   bottom
         */
        int top = 0, left = 0, rigth = n - 1, bottom = m - 1;
        int i = 0, j =0; 
        tr t = tr.top;

        while(cnt < nums){
            if(t == tr.top){
                for(j = 0 + left; j < n - rigth; j++){
                    l.add(matrix[i][j]);
                    cnt++;
                }
                j--;
                t = tr.rigth;
                top++;
            }

            if(t == tr.rigth){
                for(i = 0 + top; i < m - bottom; i++){
                    l.add(matrix[i][j]);
                    cnt++;
                }
                i--;
                t = tr.bottom;
                rigth++;
            }

            if(t == tr.bottom){
                for(j = n - 1 - rigth; j >= 0 + left; j--){
                    l.add(matrix[i][j]);
                    cnt++;
                }
                j++;
                t = tr.left;
                bottom++;
            }
            if(t == tr.left){
                for(i = m - 1 - bottom; i >= 0 + top; i--){
                    l.add(matrix[i][j]);
                    cnt++;
                }
                i++;
                t = tr.top;
                left++;
            }
        }

        return l;
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> l = spiralOrder(matrix);
        System.out.println(l.toString());
    }
}