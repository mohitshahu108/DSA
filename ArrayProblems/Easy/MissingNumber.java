package ArrayProblems.Easy;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int[] visited = new int[n + 1];
        for(int i = 0; i < visited.length; i++){
            visited[i] = i;
        }
        for(int i = 0; i < n; i++){
            visited[nums[i]] = -1;
        }
        int mn = -1;

        for(int i = 0; i < visited.length;i++){
            if(visited[i] != -1){
                mn = i;
            }
        }
        return mn;
    }
}
