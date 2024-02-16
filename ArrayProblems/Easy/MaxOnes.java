package ArrayProblems.Easy;

public class MaxOnes {
    public static int traffic(int n, int M, int[] vehicle) {
        // Write your code here.
        int m = M;
        int longest = 0;
        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            if (vehicle[j] == 0) {
                if (m > 0) {
                    vehicle[j] = 1;
                    m--;
                } else {
                    if ((j - i) > longest) {
                        longest = j - i;
                        m = M;
                        i = j;
                    }
                }
                j++;
            }
        }
        if ( vehicle[j - 1] == 1 && (j - 1 - i) > longest) {
            longest = j - i;
        }
        return longest;
    }

    public static int traffic(int N, int M, int[] VEHICLE) {
        int right = 0;
        int count = 0;
        int answer = 0;
        
        for (int left = 0; left < N; left++) {
            while (right < N && count <= M) {
                if (VEHICLE[right] == 0) {
                    count++;
                }
                if (count > M) {
                    count--;
                    break;
                }
                right++;
                answer = Math.max(answer, right - left);
            }
            if (VEHICLE[left] == 0) {
                count--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] vehicle3 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(traffic(vehicle3.length, 1, vehicle3)); // Output should be 1
    }
}
