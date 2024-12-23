package design.patterns.behavioral.strategy;

public interface SortingStrategy<E> {
    void sort(E[] array);
}