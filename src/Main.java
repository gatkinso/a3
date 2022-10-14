import Sorting.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble Sorting....");
        BubbleSort bubbles = new BubbleSort(70000);
        System.out.println("number of swaps to sort bubbles: "+ bubbles.sort());

        System.out.println("Merge Sorting....");
        MergeSort mergie = new MergeSort(700000);
        System.out.println("number of swaps to sort mergie: "+ mergie.sort());
    }
}