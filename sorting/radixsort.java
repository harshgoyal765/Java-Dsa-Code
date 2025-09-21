public class radixSort {

    // Function to get the maximum value in an array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max)
                max = value;
        }
        return max;
    }

    // A function to do counting sort of arr[] according to the digit represented by exp
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // Output array
        int[] count = new int[10]; // Count array for digits (0 to 9)

        // Store count of occurrences
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so it contains the actual position
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the output array back to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to sort an array using Radix Sort
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {348, 143, 361, 423, 538, 128, 321, 543, 366};

        System.out.println("Original array:");
        for (int num : arr) System.out.print(num + " ");

        radixSort(arr);

        System.out.println("\nSorted array:");
        for (int num : arr) System.out.print(num + " ");
    }
}
