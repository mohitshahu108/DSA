package ArrayProblems.Hard;

/**
 * mergeToSortedArray
 */
public class MergeToSortedArray {
    // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = nums1.length - n - 1; i >= 0; i--) {
            int temp = nums1[i + n];
            nums1[i + n] = nums1[i];
            nums1[i] = temp;
        }

        int i = nums1.length - m, j = 0, k =0;

        // [0, 0, 0, 1, 2, 3]
        //[2,5,6]
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums1[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                nums1[k++] = nums2[j++];
            } else if (nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i++];
            }

        }
        while (i < nums1.length) {
            nums1[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            nums1[k++] = nums2[j++];
        }
    }
}