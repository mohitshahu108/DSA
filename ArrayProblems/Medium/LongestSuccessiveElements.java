package ArrayProblems.Medium;

import java.util.Arrays;

public class LongestSuccessiveElements {
    public static int longestSuccessiveElements(int[] nums) {
        if (nums.length == 0)
            return 0;
        // Write your code here.
        // [0, 1, 1, 2]
        int max = 1;
        int cMax = 1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
            } else if (nums[i + 1] - nums[i] == 1) {
                cMax++;
            } else {
                max = Math.max(max, cMax);
                cMax = 1;
            }
        }
        max = Math.max(max, cMax);
        return max;
    }
}
