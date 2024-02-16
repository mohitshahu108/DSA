package ArrayProblems.Medium;

/**
 * BestTimeBuyStock
 */
public class BestTimeBuyStock {
    public static int maxProfit(int[] prices) {
      int max = 0;
      int mini = prices[0];
      int n = prices.length;
      
      for(int i = 0; i < n;  i++){
        int diff = prices[i] -mini;
        max = Math.max(max, diff);
        mini = Math.min(mini, prices[i]);
      }
      return max;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int num = maxProfit(arr);
        System.out.println("num" + num);
    }
}