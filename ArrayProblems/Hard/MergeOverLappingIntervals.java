package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverLappingIntervals {

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        // Write your code here.
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));
        List<List<Integer>> mergedIntervals = new ArrayList<List<Integer>>();

        for (int[] interval : arr) {
            
            if (mergedIntervals.isEmpty() || mergedIntervals.get(mergedIntervals.size() - 1).get(1) < interval[0]) {
                // If no overlapping or if current interval starts after the end of the last merged interval
                mergedIntervals.add(Arrays.asList(interval[0], interval[1]));
            } else {
                // If overlapping, merge current interval with the last merged interval
                mergedIntervals.get(mergedIntervals.size() - 1).set(1, Math.max(mergedIntervals.get(mergedIntervals.size() - 1).get(1), interval[1]));
            }
        }

        return mergedIntervals;
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        ArrayList<int[]> mergedInterval = new ArrayList();
        for (int[] interval : intervals) {
            if (mergedInterval.isEmpty() || mergedInterval.get(mergedInterval.size() - 1)[1] < interval[0]) {
                mergedInterval.add(interval);
            } else {
                mergedInterval.get(mergedInterval.size() - 1)[1] = interval[1];
            }
        }
        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }

}
