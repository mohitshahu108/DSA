package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public int binarySearch(int[] arr, int l, int h, int k) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }

    // [0,0,0,0]
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;
        if (n == 0 || n == 1 || n == 2)
            return l;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (i > 0 && nums[i] == nums[i + 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> l1 = new ArrayList<Integer>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[k]);
                    l.add(l1);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[j + 1]) {
                        k++;
                    }
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };

    }
}
