package ArrayProblems.Hard;

import java.util.*;

public class FourSum {
    // public static List<List<Integer>> bfourSum(int[] nums, int target) {
    // int n = nums.length;
    // Set<List<Integer>> st = new HashSet<>();

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // for (int k = j + 1; k < n; k++) {
    // for (int l = k + 1; l < n; l++) {
    // if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
    // List<Integer> ll1 = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
    // ll1.sort(null);
    // st.add(ll1);
    // }
    // }
    // }
    // }
    // }

    // List<List<Integer>> ll = new ArrayList<>(st);
    // return ll;
    // }

    public static List<List<Integer>> bfourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();

        // [1, 0, -1, 0, -2, 2] 0

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                HashSet<Integer> hashSet = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                        long com = (target - ((long)nums[i] + (long)nums[j] + (long)nums[k])); 
                        if (hashSet.contains(com)) {
                            List<Integer> ll1 = Arrays.asList(nums[i], nums[j], nums[k], (int)com);
                            ll1.sort(null);
                            st.add(ll1);
                        }
                        hashSet.add(nums[k]);
                }
            }
        }

        List<List<Integer>> ll = new ArrayList<>(st);
        return ll;
    }

        public static  List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> l = new ArrayList<>();
            int n = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < n; i++) {
                if(i > 0 && nums[i] == nums[i -1]){
                    continue;
                }
                for (int j = i + 1; j < n; j++) {
                    if (j > 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    int left = j;
                    int right = n - 1;
                   while (left < right) {
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];     
                    if(sum < target){
                        left++;
                    }else if(sum > target){
                        right--;
                    } else {
                        List<Integer> ll = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        l.add(ll);
                        left++;
                        right--;

                        while ( left < n && nums[left-1] == nums[left]) {
                           left++;
                        }
                        while (right < n - 1 && nums[right]==nums[right +1]) {
                           right++; 
                        }
                    }
                   } 
                }
        }

        return l;
    }


    public static void main(String[] args) {
        int arr[] = {2,2,2,2};
        List<List<Integer>> l = fourSum(arr, 8);
        System.out.println(l.toString());
    }
}
