package design.patterns.behavioral.strategy;

public class BubbleSortStrategy<E> implements SortingStrategy<E> {
    @Override
    public void sort(E[] array) {
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Bubble Sort");
        // Actual Bubble Sort Logic here
    }
}
