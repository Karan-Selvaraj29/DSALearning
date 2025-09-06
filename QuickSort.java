
public class QuickSort {
    public static void main(String[] args) {
        int[] bestCase = {4, 2, 6, 1, 3, 5, 7};  // Balanced partition
        int[] worstCase = {1, 2, 3, 4, 5, 6, 7}; // Already sorted

        System.out.print("Best Case Sorted: ");
        quickSort(bestCase, 0, bestCase.length - 1);
        printArray(bestCase);
        int val=bestCase.length-1;
        System.out.println(val);

        System.out.print("Worst Case Sorted: ");
        quickSort(worstCase, 0, worstCase.length - 1);
        printArray(worstCase);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i + 1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
