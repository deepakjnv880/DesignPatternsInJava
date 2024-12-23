package design.patterns.behavioral.strategy;

public class MergeSortStrategy<E> implements SortingStrategy<E> {
    @Override
    public void sort(E[] array) {
        // Implement Merge Sort algorithm
        System.out.println("Sorting using Merge Sort");
        // Actual Merge Sort Logic here
    }
}
