public class QuickSort {
    public static void main(String[] args) {
        int[] x = {12, 13, 7, 9, 10};
        printArray(x);

        int left = 0;
        int right = x.length - 1;

        quickSort(x, left, right);
        printArray(x);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {

            int pivot = (left + right) / 2;
            int i = left, j = right;

            while (i <= j) {
                while (arr[i] < arr[pivot]) i++;
                while (arr[j] > arr[pivot]) j--;

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            if (left < j) quickSort(arr, left, j);

            if (right > i) quickSort(arr, i, right);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}