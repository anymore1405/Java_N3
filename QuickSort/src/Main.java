import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayList = new int[]{12, 13, 7, 9, 10};
        int length = 5;
        quickSort(0, length - 1, arrayList);
//        q(arrayList, 0, length - 1);
        System.out.println(Arrays.toString(arrayList));
    }

    public static void reposition(int p1, int p2, int[] array) {
        int a = array[p1];
        array[p1] = array[p2];
        array[p2] = a;
    }

    public static int quickSortPivot(int left, int right, int[] array) {
        int pivot = (left+right)/2;
        System.out.println("pivot " + array[pivot] + " " + array[left] + " " + array[right]);
        System.out.println(Arrays.toString(array));
        while (left < right) {
            while (array[left] < array[pivot]) left++;
            while (array[right] > array[pivot]) --right;
            reposition(left, right, array);
        }
        System.out.println("right " + array[left]);
        System.out.println(Arrays.toString(array));
        return pivot;
    }

    public static void quickSort(int left, int right, int[] array) {
        if (left < right) {
            int newPivot = quickSortPivot(left, right, array);
            System.out.println("key " + array[newPivot]);
            quickSort(left, newPivot - 1, array);
            quickSort(newPivot + 1, right, array);
        }
    }
}
