import Sorting.*;

public class Main {
    public static void main(String[] args) {
        int size = 100000;

        System.out.println("Merge Sorting.... "+size+" elements");
        MergeSort mergie = new MergeSort(size);
        System.out.println("Merge Sort took: "+mergie.sort()+" milliseconds" );

        System.out.println("Bubble Sorting.... "+size+" elements");
        BubbleSort bubbles = new BubbleSort(size);
        System.out.println("Bubble Sort took: "+bubbles.sort()+" milliseconds" );

        System.out.println("Insertion Sorting.... "+size+" elements");
        InsertionSort inny = new InsertionSort(size);
        System.out.println("Insertion Sort took: "+inny.sort()+" milliseconds" );

        System.out.println("Quick Sorting.... "+size+" elements");
        QuickSort quickie = new QuickSort(size);
        System.out.println("Quick Sort took: "+quickie.sort()+" milliseconds" );
    }
}