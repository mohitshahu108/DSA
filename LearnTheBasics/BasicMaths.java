package LearnTheBasics;

/**
 * BasicMaths
 */
class BasicMathsDemo {

    int countDigits(int n) {
        int x = n;
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    int reverse(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        return r;
    }

    boolean palindrome(int n) {
        return n == reverse(n);
    }

    int gcd(int num1, int num2) {
        int ans = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    int calcGCD(int n, int m) {
        // by using ecladian algorithm

        while (n > 0 && m > 0) {
            if (n > m) {
                n = n % m;
            } else {
                m = m % n;
            }
        }

        if (n == 0)
            return m;
        return n;
    }

    boolean armstrongNumber(int n) {
        int originalno = n;
        int a = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            a = a + rem * rem * rem;
        }

        return a == originalno;
    }

    void printDivisorsBruteForce(int n) {
        System.out.println("The Divisors of " + n + " are:");
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");

        System.out.println();
    }

    void printDivisorsOptimal(int n) {

        System.out.println("The divisors of " + n + " are:");
        for (int i = 1; i <= (int) Math.sqrt(n); i++)
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i)
                    System.out.print(n / i + " ");
            }

        System.out.println();
    }

    boolean isPrime(int N) {

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;

    }

    boolean isPrimeOptimized(int N) {

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        int n = s.length();

        System.out.println(n);
        System.out.println(s);

        for(int i = 0; i <= n/2; i++){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }

    public  int[] generateFibonacciNumbers(int n) {
        // Write your code here.

        int arr[] = new int[n];

        for(int i = 0; i < n;i++){
            if(i == 0) {
                arr[0] = 0;
                continue;
            }

            if(i==1){
                arr[1]= 1;
                continue;
            }

            arr[i] = arr[i-1] + arr[i -2];

        }
        return arr;
    }

}

public class BasicMaths {
    public static void main(String[] args) {
        BasicMathsDemo basicMathsDemo = new BasicMathsDemo();
        // System.out.println(basicMathsDemo.isPalindrome("A man, a plan, a canal: Panama"));
        int arr[] = basicMathsDemo.generateFibonacciNumbers(5);
        for(int x : arr){
            System.out.println(x);
        }
    }
}