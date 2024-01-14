package ArrayProblems.Easy;
import java.util.Arrays;

public class CheckSorted {
    static public boolean check(int[] nums) {
        int[] sNums = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(sNums);
        boolean sorted = false;
        int n = nums.length;

        for (int x = 0; x <= n - 1; x++) {
            for (int i = 0; i <= n - 1; i++) {
                if (sNums[i] == nums[((x + i )% n)]) {
                    sorted = true;
                } else {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                break;
            }
        }
        return sorted;
    }

public boolean check2(int[] nums) {
    // { 3, 4, 5, 1, 2 };
     int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]>nums[i])
            {
                 count++;
            }
             
        }
        if(nums[n-1]>nums[0])
        {
            count++;
        }
        return count<=1;
    }


    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        boolean sol = check(arr);
        System.out.println(sol);
    }
}
