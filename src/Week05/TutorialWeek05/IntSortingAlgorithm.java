package Week05.TutorialWeek05;

public abstract class IntSortingAlgorithm {
    //Attributes
    private String name;
    private int[] array;
    public int[] sortedArray;

    //Constructors
    public IntSortingAlgorithm() {}
    public IntSortingAlgorithm(int[] array) {
        this.array = array;
    }

    //Getter Methods
    public int[] getArray() {
        int[] arr = new int[this.array.length];
        System.arraycopy(this.array, 0, arr, 0, this.array.length);

        return arr;
    }

    public boolean isSorted() {
        return this.sortedArray != null;
    }

    abstract public void sort();
    abstract public String toString();
}

class BubbleSort extends IntSortingAlgorithm {
    //Constructors
    public BubbleSort() {}
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        this.sortedArray = getArray();
        for (int i = 0; i < this.sortedArray.length; i++) {
            for (int j = i + 1; j < this.sortedArray.length; j++) {
                if (this.sortedArray[i] > this.sortedArray[j]) {
                    int temp = this.sortedArray[i];
                    this.sortedArray[i] = this.sortedArray[j];
                    this.sortedArray[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Bubble Sort Sorted Array: " + java.util.Arrays.toString(this.sortedArray);
    }
}

class QuickSort extends IntSortingAlgorithm {
    //Constructors
    public QuickSort() {}
    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        this.sortedArray = getArray();
        quickSortHelper(this.sortedArray, 0, this.sortedArray.length - 1);
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSortHelper(arr, low, pivot - 1);
            quickSortHelper(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public String toString() {
        return "Quick Sort Sorted Array: " + java.util.Arrays.toString(this.sortedArray);
    }
}

class MergeSort extends IntSortingAlgorithm {
    //Constructors
    public MergeSort() {}
    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        this.sortedArray = getArray();
        mergeSortHelper(this.sortedArray, 0, this.sortedArray.length - 1);
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(arr, left, mid);
            mergeSortHelper(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = java.util.Arrays.copyOfRange(arr, left, right + 1);
        int i = 0, j = mid - left + 1, k = left;

        while (i <= mid - left && j <= right - left) {
            if (temp[i] <= temp[j]) arr[k++] = temp[i++];
            else arr[k++] = temp[j++];
        }

        while (i <= mid - left) arr[k++] = temp[i++];
        while (j <= right - left) arr[k++] = temp[j++];
    }

    @Override
    public String toString() {
        return "Merge Sort Sorted Array: " + java.util.Arrays.toString(this.sortedArray);
    }
}

