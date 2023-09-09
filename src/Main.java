public class Main {

    public static void bubblesort(int[] input) {
        int n = input.length - 1;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {93, 2, -4, 25, 81, 42, 15, 739, -6, 0};
        bubblesort(arr);
        int n = arr.length - 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]);
            if (i < n) System.out.print(", ");
        }
    }
}