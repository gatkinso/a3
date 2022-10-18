package Sorting;

public class Main {
    public static void main(String[] args) {
        int size = 100000;

        SortBase sorter = new InsertionSort(size);
        System.out.println(sorter.name()+" took: "+ sorter.sort()+" milliseconds");

        sorter = new MergeSort(size);
        System.out.println(sorter.name()+" took: "+ sorter.sort()+" milliseconds");

        sorter = new BubbleSort(size);
        System.out.println(sorter.name()+" took: "+ sorter.sort()+" milliseconds");

        sorter = new QuickSort(size);
        System.out.println(sorter.name()+" took: "+ sorter.sort()+" milliseconds");

        sorter = new ExampleSort(size);
        System.out.println(sorter.name()+" took: "+ sorter.sort()+" milliseconds");
    }
}