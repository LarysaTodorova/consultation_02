package interfaces;

public interface Printable {

    public static final int CONST = 1;
    // нельзя поменять кол-во элементов в массиве,
    // но можно поменять значение элемента массива
    int[] numbers = {1, 2, 3, 4, 5};

    // строка иммутабельна(не изменна)
    String HOST = "http://localhost8080";

    // public abstract
    void print();

    // JDK 8
    default  void  printDefault () {
        System.out.println("Default method");
    }

    static  void staticMethod() {
        System.out.println("Static method");
    }
}
