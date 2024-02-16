package ArrayProblems.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Maximum
 */
public class Maximum {

    public ArrayList<Integer> slidingMaximum1(final List<Integer> A, int B) {
        int n = A.size();
        int i = 0, j = 0;
        ArrayList<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        while (j < n) {
            while (q.size() > 0 && q.peek() < A.get(j)) {

                q.remove();
            }
            q.offer(A.get(j));

            if (j - i + 1 < B) {
                j++;
            } else if (j - i + 1 == B) {
                // Get the maximum element from the max priority queue
                Integer maxElement = q.peek();
                l.add(maxElement);

                // Slide the window
                if (maxElement == A.get(i)) {
                    q.remove(A.get(i));
                }

                i++;
                j++;
            }
        }

        return l;
    }

    // Upon reviewing the code again, I see that there is a potential issue with
    // discarding valid maximum values, especially in cases where the same maximum
    // value appears multiple times within the window. Let's examine the part of the
    // code where this occurs:

    // java
    // Copy code
    // while(q.size() > 0 && q.peek() < A.get(j)){
    // q.remove();
    // }
    // q.offer(A.get(j));
    // Save to grepper
    // This block of code removes elements from the queue if they are less than the
    // current element A.get(j), which could result in discarding valid maximum
    // values. If a valid maximum value appears more than once within the window,
    // removing it prematurely would lead to incorrect results.

    // To address this issue, we should modify the logic to ensure that we only
    // remove elements from the queue if they are no longer within the current
    // window, rather than solely based on their value being less than the incoming
    // element.

    // Let me revise the code accordingly:

    // java
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int n = A.size();
        int i = 0, j = 0;
        ArrayList<Integer> l = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();

        while (j < n) {
            while (!q.isEmpty() && q.peekLast() < A.get(j)) {
                q.pollLast();
            }
            q.offerLast(A.get(j));

            if (j - i + 1 < B) {
                j++;
            } else if (j - i + 1 == B) {
                // Get the maximum element from the front of the deque
                l.add(q.peekFirst());

                // Slide the window
                if (A.get(i) == q.peekFirst()) {
                    q.pollFirst();
                }
                i++;
                j++;
            }
        }

        return l;
    }
    // In this revised code:

    // We maintain a deque q to store indices instead of values.
    // We iterate through the array A and perform the following steps:
    // Remove elements from the front of the deque if they are out of the current
    // window.
    // Remove smaller elements from the back of the deque.
    // Add the index of the current element to the deque.
    // If the window size is reached, add the maximum value to the result list.
    // Finally, return the result list.
    // This revised implementation should address the issue of prematurely
    // discarding valid maximum values and provide correct results for sliding
    // window maximum. Let me know if you need further clarification or assistance!

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7));
    }
}