package Sorting;

public class ExampleSort extends SortBase {
    public ExampleSort(int size) {
        super(size);
    }

    @Override
    public String name() {
        return "ExampleSort";
    }

    @Override
    public void sortImpl() {
        exampleSort();
    }

    private void exampleSort() {
        int n = this.doubleArray.length;
        for (int i = 1; i < n; ++i) {
            double key = this.doubleArray[i];
            int j = i - 1;

            /* Move elements of this.doubleArray[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && this.doubleArray[j] > key) {
                this.doubleArray[j + 1] = this.doubleArray[j];
                j = j - 1;
            }
            this.doubleArray[j + 1] = key;
        }
    }
}
