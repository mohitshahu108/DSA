package LearnTheBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * BasicHashing
 */
public class BasicHashing {

    public static int[] countFrequency(int n, int x, int[] nums) {
        // Write your code here.
        int arr[] = new int[x];

        for (int i = 0; i < n; i++) {
            arr[nums[i] - 1]++;
        }
        return arr;
    }

    public static int[] getFrequencies(int[] v) {
        // Write Your Code Here
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int r[] = new int[2];// [h, l]
        int hiv = 0;
        int lov = Integer.MAX_VALUE;

        for (int i = 0; i < v.length; i++) {
            Integer hv = hm.get(v[i]);

            if (hv == null) {
                hm.put(v[i], 1);
            } else {
                hm.put(v[i], hv++);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            Integer va = entry.getValue();
            if (va > hiv) {
                hiv = va;
                r[0] = key;
            } else if (va == hiv) {
                if (key < r[0])
                    r[0] = key;
            }

        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            Integer va = entry.getValue();

            if (va < lov) {
                lov = va;
                r[1] = key;
            } else if (va == lov) {
                if (key < r[1]) r[1] = key;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        // int arr[] = countFrequency(5, 3, new int[] { 1, 1, 2, 2, 3 });
        // for (int x : arr) {
        // System.out.println(x);
        // }
        int arr[] = getFrequencies(new int[] { 1, 2, 3, 1, 1, 4 });

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}