package ArrayProblems.Medium;

public class NextPermutation {
    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int deep = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                deep = i - 1;
                break;
            }
        }

        if (deep == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > deep; i--) {
            if (nums[i] > nums[deep]) {
                int temp = nums[i];
                nums[i] = nums[deep];
                nums[deep] = temp;
                break;
            }
        }

        // reverse the array from deep + 1 to n - 1
        reverse(nums, deep + 1, n - 1);
    }

    public static void main(String[] args) {

    }
}
