package LearnTheBasics;

import java.util.Scanner;

/*  Four rules for patterns
 *  1. For the outter loop count the number of lines 
 *  2. For the inner loop, focus on the columns and connect them somehow to the rows
 *  3. Whatever you are printing print them inside the inner loop.
 *  4. (optional) Observe the symmetry
 */

class Pattern {

    public void square(int n) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */

    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     */

    public void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    /*
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */
    public void pattern5(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    public void pattern6(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * *
     * * *
     * * * * *
     * * * * * * *
     */
    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * * * * * * * * * *
     * * * * * * * *
     * * * * * *
     * * * *
     * *
     */
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * *
    // * *
    // *

    public void pattern9(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int it = i;
            if (i > n)
                it = 2 * n - i;
            for (int j = 1; j <= it; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public void pattern10(int n) {
        // Write your code here.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public  void pattern11(int n) {
        // Write your code here.
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            for(int j = 1; j <= 2 * n - 2 * i; j++){
                System.out.print("  ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public void pattern12(int n){
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }

    public void pattern13(int n){

    }

    public void pattern14(int n){
        for(int i = 1; i<=n; i++){
            for (int j = 65; j < 65 + i; j++) {
                System.out.print((char) j);
                System.out.print(' ');
            }
            System.out.println();
        }
    }


    public void pattern22(int n){
        for(int i = 1; i <= 2*n -1; i++){
            for(int j = 1; j <= 2*n - 1; j++){
                int top = i -1;
                int left = j -1;
                int right = 2 * n - 1 -j;
                int down = 2 * n - 1 - i;

                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

}

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = new Pattern();
        int n = sc.nextInt();
        // sc.close();
        // p.square(n);
        // System.out.println();
        // p.pattern2(n);
        // System.out.println();
        // p.pattern2(n);
        // System.out.println();
        sc.close();
        // p.pattern7(n);
        // p.pattern8(n);
        // p.pattern9(n);
        // p.pattern10(n);
        // p.pattern11(n);
        // p.pattern12(n);
        // p.pattern13(n);
        p.pattern14(n);
    }
}
