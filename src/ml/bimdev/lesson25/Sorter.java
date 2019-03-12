package ml.bimdev.lesson25;

class Sorter {
    private static int[] helper;

    static void mergeSort(int[] arr) {
        helper = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        for (int k = low; k <= high; k++) {
            helper[k] = arr[k];
        }

        int k = low;
        while (i <= mid && j <= high) {
            if (helper[i] < helper[j]) {
                arr[k++] = helper[i++];
            } else {
                arr[k++] = helper[j++];
            }
        }

        while (i <= mid) arr[k++] = helper[i++];
        while (j <= high) arr[k++] = helper[j++];
    }
}
