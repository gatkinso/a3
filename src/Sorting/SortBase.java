package Sorting;

public class SortBase {
    double[] doubleArray;
    int size;

    SortBase(int size) {
        this.size = size;
        this.doubleArray = new double[this.size];

        for(int i = 0; i < this.size; i++) {
            this.doubleArray[i] = Math.random() * 1000000.0;
        }
    }
}
