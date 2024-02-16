package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.List;

/**
 * PascalTriangle
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> l1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    l1.add(1);
                } else {
                    List<Integer> pl = l.get(i - 1);
                    l1.add(pl.get(i) + pl.get(i - 1));
                }
            }
            l.add(l1);
        }
        return l;
    }

    public static void main(String[] args) {
        List<List<Integer>> l = generate(3); 
        System.out.println(l.toString());
    }
}