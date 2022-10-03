package pack7;
import java.util.Scanner;
public class Bookshelf {
    int size;
    Book[] books = new Book[100];
    public Bookshelf(int Size)
    {
        size = Size;
        int y;
        String str;
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < size;i++)
        {
            Book b = new Book();
            System.out.print("Input year: ");
            y = s.nextInt();
            b.setYear(y);
            System.out.print("Input name of book: ");
            str = s.next();
            b.setName(str);
            System.out.print("Input author: ");
            str = s.next();
            b.setAuthor(str);
            this.books[i] = b;
        }
    }
    public void sort()
    {
        int min = 10000;
        int ind = 0;
        Book[] temp = new Book[size];
        for(int j = 0; j<size; j++)
        {
            Book b = new Book();
            for(int i = 0; i<size; i++)
            {
                if (this.books[i].getYear() < min)
                {
                    min = this.books[i].getYear();
                    ind = i;
                }
            }
            b.setYear(min);
            b.setName(this.books[ind].getName());
            b.setAuthor(this.books[ind].getAuthor());
            temp[j] = b;
            this.books[ind].setYear(10000);
            min = 10000;
        }
        this.books = temp.clone();
    }
    public void getMax()
    {
        int max = 0;
        int ind = 0;
        for(int i = 0; i<size; i++)
        {
            if (this.books[i].getYear() > max)
            {
                max = this.books[i].getYear();
                ind = i;
            }
        }
        System.out.println("Year: " + this.books[ind].getYear() + "; Name of book: " + this.books[ind].getName() + "; Author: " + this.books[ind].getAuthor());
    }
    public void getMin()
    {
        int min = 10000;
        int ind = 0;
        for(int i = 0; i<size; i++)
        {
            if (this.books[i].getYear() > min)
                min = this.books[i].getYear();
        }
        System.out.println("Year: " + this.books[ind].getYear() + "; Name of book: " + this.books[ind].getName() + "; Author: " + this.books[ind].getAuthor());
    }
    public void output()
    {
        for(int i = 0; i<size; i++)
            System.out.println("Year: " + this.books[i].getYear() + "; Name of book: " + this.books[i].getName() + "; Author: " + this.books[i].getAuthor());
    }
}
