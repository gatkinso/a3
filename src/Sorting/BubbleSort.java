package Sorting;

public class BubbleSort extends SortBase {
    public BubbleSort(int i) {
        super(i);
    }

    public long sort() {
        long swaps = 0;
        for (int i = 0; i < this.size - 1; i++) {

            // Last i elements are already in place
            for (int j = 0; j < this.size - i - 1; j++) {
                if (this.doubleArray[j] > this.doubleArray[j + 1]) {
                    //swap [j] and [j+1]
                    double temp = this.doubleArray[j];
                    this.doubleArray[j] = this.doubleArray[j + 1];
                    this.doubleArray[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }

}