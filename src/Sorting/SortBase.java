package Sorting;

public abstract class SortBase implements ISort {
    double[] doubleArray;
    int size;
    long start;

    SortBase(int size) {
        this.size = size;
        this.doubleArray = new double[this.size];

        for (int i = 0; i < this.size; i++) {
            this.doubleArray[i] = Math.random() * 1000000.0;
        }

        this.start = System.currentTimeMillis();
    }

    public long sort() {
        sortImpl();
        return System.currentTimeMillis() - this.start;
    }

    abstract void sortImpl();
}
