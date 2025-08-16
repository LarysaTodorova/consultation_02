package interfaces;

public class Presentation implements ColorPrintable {

    String title;
    String author;
    String theme;
    int amountPages;

    public Presentation(String title, String author, String theme, int amountPages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.amountPages = amountPages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Presentation in color by " + author + "; title: " + title);
    }

    @Override
    public void print() {
        System.out.println("Presentation w/b by " + author + "; pages: " + amountPages);
    }
}
