package design.patterns.behavioral.strategy;

public class SortingContext<E> {
    private SortingStrategy<E> sortingStrategy;

    public SortingContext(SortingStrategy<E> sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy<E> sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(E[] array) {
        sortingStrategy.sort(array);
    }
}
