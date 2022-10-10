package lab02.task07;

import java.util.ArrayList;
import java.util.Comparator;

public class BookShelf {
    public ArrayList<Book> books;
    public Integer amount;

    public BookShelf(ArrayList<Book> books) {
        this.books = books;
    }

    public void sort(ArrayList<Book> b){
        b.sort(Comparator.comparingInt(Book::getYear));
    }

    //То же самое что и функция выше только без сокращений

    /*public ArrayList<Book> sort(ArrayList<Book> b){
        Collections.sort(b, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                if (o1.getYear() < o2.getYear()) {
                    return -1;
                }
                if (o1.getYear() > o2.getYear()) {
                    return 1;
                }
                return 0;
            }
        });
        return b;
    }*/


    public ArrayList<Book> firstAndLast(ArrayList<Book> b) {
        Book first = b.get(0);
        Book last = b.get(b.size() - 1);
        for (int i = 0; i < b.size() - 1; i++) {
            if (first.getYear() > b.get(i).getYear()) {
                first = b.get(i);
            }
            if (last.getYear() < b.get(i).getYear()) {
                last = b.get(b.size() - 1);
            }
        }
        ArrayList<Book> lastAndFirst = new ArrayList<>(2);
        lastAndFirst.add(last);
        lastAndFirst.add(first);
        return lastAndFirst;
    }
}
