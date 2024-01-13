package Sorting2;

import java.util.ArrayList;

public class MergeSort {
    public static void merge(int[] arr, int l, int mid, int r) {        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = l;
        int rigth = mid +1;

       while(left <= mid && rigth <= r){
        if(arr[left] < arr[rigth]){
            temp.add(arr[left]);
            left++;
        } else {
            temp.add(arr[rigth]);
            rigth++;
        }
       } 

       while(left <= mid){
            temp.add(arr[left]);
            left++;
       }

       while(rigth <= r){
        temp.add(arr[rigth]);
        rigth++;
       }

       for(int i = l; i<=r; i++){
        arr[i] = temp.get(i - l);
       }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        // Write your code here
        if (l >= r) return;
        int mid = l + (r - l) / 2; // hypothetical divide
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 7, 2, 1 };
        mergeSort(arr, 0, 4);

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}