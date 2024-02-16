package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInWindow {
    public static long[] printFirstNegativeInteger(long A[], int N, int K) {
        // array A
        // size Array A = N
        // window size = K
        // make hashmap of <index in arrary, value>
        int i = 0, j = 0;
        Queue<Long> q = new LinkedList<>();
        ArrayList<Long> l = new ArrayList<>();

        while (j < N) {
            long ele = A[j];
            if (ele < 0) {
                q.add(ele);
            }
            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                if (q.size() == 0) {
                    l.add(0l);
                } else {
                    l.add(q.peek());
                    if (A[i] == q.peek()) {
                        q.remove();
                    }
                }
                i++;
                j++;
            }
        }

        long[] resultArray = l.stream().mapToLong(Long::longValue).toArray();
        return resultArray;
    }

    public static void main(String[] args) {
        long[] A = { -8, 2, 3, -6, 10 };
        long[] b = printFirstNegativeInteger(A, A.length, 2);
        System.out.println(b.toString());
    }
}
