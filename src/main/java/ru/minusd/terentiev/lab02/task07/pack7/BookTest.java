package pack7;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf obj = new Bookshelf(3);
        System.out.print("Before sort: ");
        obj.output();
        obj.sort();
        System.out.print("After sort: ");
        obj.output();
        System.out.print("Max year: ");
        obj.getMax();
        System.out.print("Min year: ");
        obj.getMin();
    }
}
