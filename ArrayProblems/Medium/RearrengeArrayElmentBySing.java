package ArrayProblems.Medium;

import java.util.Stack;

public class RearrengeArrayElmentBySing {
    public int[] rearrangeArrayBruteForce(int[] nums) {
        // [3,1,-2,-5,2,-4]
        int n = nums.length;
        for(int i = 0; i < n; i++){
            // check if current place is even and number is negative
            if(i % 2 == 0 && nums[i] < 0){
                for(int j = i +1; j < n; j++){
                    if (nums[j] > 0) {
                        // spaw
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }

            // check if current place is odd and number is positive
            if(i % 2 != 0 && nums[i] > 0){
                for(int j = i + 1; j < n; j++){
                    if (nums[j] < 0) {
                        // spaw
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public int[] rearrangeArray(int[] nums){
        Stack<Integer> ps = new Stack<>();
        Stack<Integer> ns = new Stack<>();
        int n = nums.length;
        for(int i =0; i< n; i++){
            if(nums[i]>0){
                ps.push(nums[i]);
            }else{
                ns.push(nums[i]);
            }
        }
        for(int i = n -1; i >= 0; i--){
            if(i%2!=0){
                int ne = ns.pop();
                nums[i] = ne;
            }else{
                int pe = ps.pop();
                nums[i] = pe;
            }
        }
        return nums;
    }

    // public int[] rearrangeArray(int[] nums) {
    //     // [3,1,-2,-5,2,-4]
    //     // [3,-2, 1,-5,2,-4]
    //     int n = nums.length;
    //     int i = 0, j = 1, k = 1;
    //     while(i < n){
    //         // check if current place is even and number is negative
    //         if(i % 2 == 0 && nums[i] < 0){
    //             j = i + 1;
    //             while(nums[j] < 0 && j < n){
    //                 j++;
    //             }
    //             // swap
    //             int temp = nums[i];
    //             nums[i] = nums[j];
    //             nums[j] = temp;
    //         }
    //         // check if current place is odd and number is positive
    //         if(i % 2 != 0 && nums[i] > 0){
    //             k = i + 1;
    //             while(nums[k] > 0 && j < n){
    //                 k++;
    //             }
    //             // swap
    //             int temp = nums[i];
    //             nums[i] = nums[k];
    //             nums[k] = temp;
    //         }
    //         i++;
    //     }
    //     return nums;
    // }
}
