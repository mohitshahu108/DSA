package ArrayProblems.Medium;

import java.util.HashMap;
import java.util.Hashtable;

public class CountAllSubarraysWithGivenSum {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
      // Write your code here.
      int count = 0;
      int i = 0;
      int j = 0; // Start j from 0
      int n = arr.length;
      
      int sum = 0; // Initialize sum to 0
      
      while (j < n) { // Use j < n as the stopping condition
          sum += arr[j]; // Add arr[j] to sum
          while (sum > s && i <= j) { // Use i <= j to handle negative elements
              sum -= arr[i]; // Remove arr[i] from sum
              i++;
          }
          if (sum == s) {
              count++;
          }
          j++;
      }
      

      return count;
    } 


    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int n = nums.length;
        map.put(prefixSum, 1);

        // [1,1,1] k = 2
        for(int i = 0; i < n ; i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;
            count += map.get(remove) != null ? map.get(remove) : 0;
            map.put(prefixSum, map.get(prefixSum) != null ? map.get(prefixSum) + 1 : 1);
        }

        return count;
    }
}
