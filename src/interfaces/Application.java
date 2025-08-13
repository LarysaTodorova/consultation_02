package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Book book = new Book("Философия Java", "Б. Эхкель");

        Printable printable = new Book("Master & Margarita", "Bulgakov");

        book.print();
        printable.print();

        book.bookClassMethod();

        List<Book> books= new LinkedList<>();
        books = new ArrayList<>();
    }

}
