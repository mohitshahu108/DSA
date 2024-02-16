package ArrayProblems.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * SuperiorElements
 */
public class SuperiorElements {
    public static List<Integer> superiorElements(int[] a) {
        // Write your code here.
        ArrayList<Integer> me = new ArrayList<>();
        int n = a.length;
        int j = n - 1;
        int i = n - 2;
        me.add(a[j]);

        while (i >= 0) {
            if (a[i] > a[j]) {
                me.add(a[i]);
                j = i;
            }
            i--;
        }

        return me;
    }

    public static void main(String[] args) {

    }
}