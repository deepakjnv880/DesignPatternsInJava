package design.patterns.creational.prototype;

public class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        //super.clone(); this creates shallow copy not deep copy
        Book newDeepCopyBook = new Book(this.id, this.name);
        return newDeepCopyBook;
    }
}
