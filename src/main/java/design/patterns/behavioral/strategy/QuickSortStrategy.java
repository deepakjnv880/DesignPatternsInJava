package design.patterns.behavioral.strategy;

public class QuickSortStrategy<E> implements SortingStrategy<E> {
    @Override
    public void sort(E[] array) {
        // Implement Quick Sort algorithm
        System.out.println("Sorting using Quick Sort");
        // Actual Quick Sort Logic here
    }
}
