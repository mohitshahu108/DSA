package LearnTheBasics;

import java.util.ArrayList;

class BasicRecursionDemo{
    // array of 1 to N 
    public int[] printNo(int x, int[] arr){
         arr[x - 1] = x;
        if(x == 1){
            return arr;
        }
        return printNo(x - 1, arr);
    }

    public int[] printRecursion(int x){
        int arr[] = new int[x]; 
        printNo(x, arr);
        return arr;
    }

    public static ArrayList<String> rf(int x, int n, ArrayList<String> al){
        if(x == n) return al;
        al.add("Coding Ninjas");
        return rf(x + 1, n, al);
    }

    public int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

}

public class BasicRecursion {

   public static void main(String[] args) {
    BasicRecursionDemo basicRecursionDemo = new BasicRecursionDemo();
    int arr[] = basicRecursionDemo.printRecursion(5);
    for(int x : arr){
        System.out.println(x);
    }
   } 
}