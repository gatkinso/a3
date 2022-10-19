package Sorting;

public abstract class SortBase implements ISort {
    double[] doubleArray;
    int size;

    SortBase(int size) {
        this.size = size;
        this.doubleArray = new double[this.size];

        for (int i = 0; i < this.size; i++) {
            this.doubleArray[i] = Math.random() * 1000000.0;
        }
    }

    public long sort() {
        long start = System.currentTimeMillis();
        sortImpl();
        return System.currentTimeMillis() - start;
    }

    abstract void sortImpl();
}
