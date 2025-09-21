public class InterpolationSearch {

    // Interpolation Search function
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            // Prevent division by zero
            if (arr[low] == arr[high]) {
                if (arr[low] == key)
                    return low;
                else
                    return -1;
            }

            // Estimate the position using interpolation formula
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            // Check if the element is found
            if (arr[pos] == key) {
                return pos;
            } else if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        // If not found
        return -1;
    }  


    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 70;

        int index = interpolationSearch(arr, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
