package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.List;

public class NumberOfInversions {
    public static int merge(int a[], int l, int mid, int r, int cnt) {

        int i = l;
        int j = mid + 1;
        List<Integer> al = new ArrayList<>();

        while (i <= mid && j <= r) {
            if (a[i] > a[j]) {
                cnt++;
                al.add(a[j]);
            } else {
                al.add(a[i]);
            }
        }

        while (i <= mid) {
            al.add(a[i]);
        }
        


        return cnt;
    }

    public static int findInversion(int[] a, int l, int r, int cnt) {
        int mid = l + (r-l) / 2;
        cnt = findInversion(a, l, mid, cnt);
        cnt = findInversion(a, mid + 1, r, cnt);
        cnt = merge(a, l, mid, r, cnt);
        return cnt;
    }

    public static int numberOfInversions(int[] a, int n) {
        int cnt = findInversion(a, 0, a.length - 1, 0);
        return cnt;
    }
}
