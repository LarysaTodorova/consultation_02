package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Book book = new Book("Философия Java", "Б. Эхкель");

        Printable printable = new Book("Master & Margarita", "Bulgakov");

        book.print();
        printable.print();

        book.bookClassMethod();

        List<Book> books = new LinkedList<>();
        books = new ArrayList<>();

        Presentation presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP",
                20
        );

        presentation.print();
        presentation.colorPrint();

        printable.printDefault();
        presentation.printDefault();

        System.out.println("==================================");

        Printable[] printables = {book, presentation};
        printables[0].print();
        printables[1].print();

        Printable.staticMethod();

        System.out.println(Arrays.toString(Printable.numbers));
        Printable.numbers[2] = 10;
        System.out.println(Arrays.toString(Printable.numbers));

        book.recycle();

        System.out.println("================================");

        if (printable instanceof Recycleble) {
            Recycleble recycleble = (Recycleble) printable;
            System.out.println("Cмог привести");
            recycleble.recycle();
        }

        if (presentation instanceof Recycleble) {
            Recycleble recycleble = (Recycleble) presentation;
        }else {
            System.out.println("Презентацию нельзя привсти к типу Recycleable");
        }

        System.out.println("==============================\n");

        printPrintable(book);
        printPrintable(printable);
        printPrintable(presentation);
    }

    public static void printPrintable(Printable printable) {
        printable.print();
    }

}
