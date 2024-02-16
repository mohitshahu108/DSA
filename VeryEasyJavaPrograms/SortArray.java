package VeryEasyJavaPrograms;
    import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 8, 2, 5};
        System.out.println("Original Array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
