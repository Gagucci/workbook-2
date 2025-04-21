package org.example;
import org.example.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Book bookOne = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
//        Book bookTwo = new Book("The Three Body Problem", "Liu Cixin", "9780765382030");
//        Book bookThree = new Book("1984", "George Orwell", "9780451524935");

        //Create an arraylist of Books
        List<Book> bookList = new ArrayList<>();

        //Create 3 book objects using the constructor
        Book bookOne = new Book("The Three-Body Problem", "Cixin Liu", "9780765382030");
        Book bookTwo = new Book("The Three Body Problem", "Liu Cixin", "9780765382030");
        Book bookThree = new Book("1984", "George Orwell", "9780451524935");
        Book bookFour = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        //adding a book to the list
        bookList.add(bookOne);
        bookList.add(bookTwo);
        bookList.add(bookThree);

        for (Book book : bookList) {
            book.displayBookInfo();
            System.out.println();
        }
//          Method 2: Classic For-Loop with index
//        System.out.println("📘 Using classic for-loop:");
//        for (int i = 0; i < bookList.size(); i++) {
//            bookList.get(i).displayDetails();
//            System.out.println();
//        }

//          Create an array of Books
//        Book[] books = new Book[15];
//
//        books[0] = new Book("The Three-Body Problem", "Cixin Liu", "9780765382030");
//        books[1] = new Book("The Three Body Problem", "Liu Cixin", "9780765382030");
//        books[2] = new Book("1984", "George Orwell", "9780451524935");
//        books[3] = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
//        books[4] = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
//        books[5] = new Book("Pride and Prejudice", "Jane Austen", "9780141439518");
//        books[6] = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
//        books[7] = new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780544003415");
//        books[8] = new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227");
//        books[9] = new Book("The Alchemist", "Paulo Coelho", "9780062315007");
//        books[10] = new Book("The Da Vinci Code", "Dan Brown", "9780307474278");
//        books[11] = new Book("The Hunger Games", "Suzanne Collins", "9780439023528");
//        books[12] = new Book("The Fault in Our Stars", "John Green", "9780525478812");
//        books[13] = new Book("The Book Thief", "Markus Zusak", "9780375842207");
//        books[14] = new Book("The Kite Runner", "Khaled Hosseini", "9781594631931");
        //Display the books in the array
    }
}