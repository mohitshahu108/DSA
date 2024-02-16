package ArrayProblems.SlidingWindow.variablesize;

import java.util.HashMap;

public class LongestSubArrayOfSumK {

    public static int lenOfLongSubarr(int a[], int n, int k) {
        int i = 0;
        long sum = 0; // sum should be long as we are summing integer, take int may lead to overflow
        HashMap<Long, Integer> map = new HashMap<>();
        int maxLen = 0;

        // k = 8
        // [15, -2, 2, -8, 1, 7, 10, 23]
        //  15, 13, 15, 7, 8, 15,
        while (i < n) {
            sum += a[i];
            if(sum == k){
                maxLen = i + 1;
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                int idx = map.get(sum - k);
                int len = i - idx;
                maxLen = Math.max(maxLen, len);
            }          
            
            i++;
        }
        return maxLen;
    }
}
