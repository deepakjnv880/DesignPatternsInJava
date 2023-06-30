package design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable {
    String name;
    public List<Book> books = new ArrayList<>();

    public void loadBooks() {
        //in actual in might be connected to database to load books and hence time taking operation
        //for now hardcoding the data
        for (int i = 1; i <= 7; i++) {
            books.add(new Book(i, "Book " + i));
        }
    }

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public Library clone() throws CloneNotSupportedException {
        //super.clone(); this creates shallow copy not deep copy
        Library newDeepCopyLibrary = new Library(this.name);
        for (Book book : books) {
            newDeepCopyLibrary.books.add(book.clone());
        }
        return newDeepCopyLibrary;
    }
}
