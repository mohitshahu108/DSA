package ArrayProblems.Easy;

import LearnTheBasics.CommonMethods;

public class RotateRight {

    public static void reverse(int[] arr, int s, int e) {
        //1,2,3,4,5,6,7, k = 3 
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    //1,2,3,4,5,6,7, k = 3 
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - k - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 3);
        CommonMethods.printArray(arr);
    }

}
