package Sorting;

public class InsertionSort extends SortBase {
    public InsertionSort(int size) {
        super(size);
    }

    @Override
    public void sortImpl() {
        this.insertionSort(this.doubleArray);
    }

    private void insertionSort(double arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public String name() {
        return "InsertionSort";
    }
}
