package design.patterns.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        // Create SortingContext with BubbleSortStrategy
        SortingContext<String> sortingContext = new SortingContext<>(new BubbleSortStrategy<>());
        String[] array1 = {"5", "2", "11", "1", "5"};
        sortingContext.performSort(array1); // Output: Sorting using Bubble Sort

        // Change strategy to MergeSortStrategy
        SortingContext<Integer> sortingContext2 = new SortingContext<>(new BubbleSortStrategy<>());
        sortingContext2.setSortingStrategy(new MergeSortStrategy<>());
        Integer[] array2 = {8, 3, 7, 4, 2};
        sortingContext2.performSort(array2); // Output: Sorting using Merge Sort

        // Change strategy to QuickSortStrategy
        sortingContext2.setSortingStrategy(new QuickSortStrategy<>());
        Integer[] array3 = {6, 1, 3, 9, 5};
        sortingContext2.performSort(array3); // Output: Sorting using Quick Sort
    }
}
