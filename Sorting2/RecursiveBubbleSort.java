package Sorting2;

import LearnTheBasics.CommonMethods;

/**
 * RecursiveBubbleSort
 */
public class RecursiveBubbleSort {

    // [8, 3, 4, 1]
    static void bubble_sort(int[] arr, int n) {
        // Base case: range == 1.
        if (n == 1)
            return;

        int didSwap = 0;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }

        // if no swapping happens.
        if (didSwap == 0)
            return;

        // Range reduced after recursion:
        bubble_sort(arr, n - 1);

    }

    static void insertionSort(int[] arr, int n) {
        if (n == 1)
            return;
        insertionSort(arr, n - 1);
        int j = n - 1;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

    }

        // [3, 1, 2, 4]
        public static void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    
        public static int findPivot(int[] arr, int l, int h){
            int pivot = arr[l];
            int i = l, j = h;
    
            while(i < j){
                while(arr[i] <= pivot && i < h){
                    i++;
                }
                while(arr[j] > pivot && j > l){
                    j--;
                }
                if(i < j){
                    swap(arr, i , j);
                }
            }
            swap(arr, j, l);
            return j;
        }
        
        public static void quickSort(int[] input,int startIndex, int endIndex) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * No need to print or return the output.
             * Taking input and printing output is handled automatically.
             */
            if(startIndex < endIndex){
             int pInx = findPivot(input, startIndex, endIndex);
             quickSort(input, startIndex, pInx);
             quickSort(input, pInx+1, endIndex);
            }
        }

    public static void main(String[] args) {
        int arr[] = { 47, 23, 25, 2, 5, 1 };
        // bubble_sort(arr, arr.length);
        // insertionSort(arr, arr.length);
        quickSort(arr, 0, arr.length - 1);
        CommonMethods.printArray(arr);
    }

}