package ArrayProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//ninja problem
public class RemoveDuplicate {
    // my
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        HashSet<Integer> hs = new HashSet<>(arr);
        return hs.toArray().length;
    }

    // with two pointer
    public static int removeDuplicates2(ArrayList<Integer> arr, int n) {
        int count  = 0;
        int i = 0, j = 1;

        while(i < n && j < n){
            if(arr.get(i) == arr.get(j)){
                j++;
            }else{
                count++;
                i = j;
                j++;
            }
        }
        return count;
    }





    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 5 };
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        removeDuplicates(al, al.size());
    }
}
