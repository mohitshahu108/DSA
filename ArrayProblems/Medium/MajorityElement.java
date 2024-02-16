package ArrayProblems.Medium;

import java.util.HashMap;

public class MajorityElement {
    public static int majoritylement(int[] v) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int me = 0;
        int n = v.length;

        for (int i = 0; i < n; i++) {
            Integer va = map.get(v[i]);
            if (va != null) {
                map.put(v[i], va + 1);
            } else {
                map.put(v[i], 1);
            }
        }

        for (Integer i : map.keySet()) {
            int va = (int) map.get(i);
            if (va > n / 2) {
                me = i;
            }
        }

        return me;
    }

    public static int majorityElement(int[] nums) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int me = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Integer va = map.get(nums[i]);
            if (va != null) {
                map.put(nums[i], va + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer i : map.keySet()) {
            int va = (int) map.get(i);
            if (va > n / 2) {
                me = i;
            }
        }

        return me;
    }


    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 3, 1, 1, 3, 1, 1 };
        int v = majorityElement(arr);
        System.out.println(v);
    }

}
