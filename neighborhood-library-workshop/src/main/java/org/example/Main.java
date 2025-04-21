package org.example;
import org.example.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> booksArrayList = new ArrayList<>();

        booksArrayList.add(new Book(1, "978-3-1600", "The Great Gatsby"));
        booksArrayList.add(new Book(2, "978-0-7432", "The Three Body Problem"));
        booksArrayList.add(new Book(3,"978-5-1403", "Divergent"));
        booksArrayList.add(new Book(4,"979-0-1738", "Of Mice and Men"));
        booksArrayList.add(new Book(5,"986-4-1313","The Dark Forest"));
        booksArrayList.add(new Book(6,"978-4-5612","All Tomorrows"));
        booksArrayList.add(new Book(7,"978-1-2345","The Hitchhiker's Guide to the Galaxy"));
        booksArrayList.add(new Book(8,"979-2-4536","The Martian"));
        booksArrayList.add(new Book(9,"978-3-4567","The Alchemist"));
        booksArrayList.add(new Book(10,"978-1-2255","The Da Vinci Code"));
        booksArrayList.add(new Book(11,"978-0-1234","The Hunger Games"));
        booksArrayList.add(new Book(12,"973-1-2365","The Fault in Our Stars"));
        booksArrayList.add(new Book(13,"928-7-2335","The Book Thief"));
        booksArrayList.add(new Book(14,"977-2-6274","The Kite Runner"));
        booksArrayList.add(new Book(15,"976-4-4545","The Catcher in the Rye"));
        booksArrayList.add(new Book(16,"921-3-2377","The Lord of the Rings"));
        booksArrayList.add(new Book(17,"978-0-0947","The Hobbit"));
        booksArrayList.add(new Book(18,"958-0-9873","Pride and Prejudice"));
        booksArrayList.add(new Book(19,"974-0-6543","To Kill a Mockingbird"));
        booksArrayList.add(new Book(20,"978-1-1244","The Goblet of Fire"));


    }
}