package stream.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Разделите список книг на две группы:
// дороже 500 рублей и дешевле. В каждой группе посчитайте общее количество страниц.
public class Task2 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book A", 450, 300),
                new Book("Book B", 600, 500),
                new Book("Book C", 700, 200),
                new Book("Book D", 300, 650),
                new Book("Book E", 550, 400)
        );

        System.out.println(books.stream()
                .collect(Collectors.partitioningBy(book -> book.getPages() > 500, Collectors.summingInt(Book::getPages))));
    }
}


class Book {
    private String title;
    private double price;
    private int pages;

    Book(String title, double price, int pages) {
        this.title = title;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return title + " (" + pages + " pages, " + price + " rub)";
    }
}
