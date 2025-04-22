package org.example;
import java.util.Scanner;


public class LibraryLogic {

    private Book[] booksArray;
    private Scanner read;

    public void Library() {
        read = new Scanner(System.in);
        initLibrary();
    }

    // initializes books array and loads 20 books

    private void initLibrary() {
        Book[] booksArray = new Book[20];
        booksArray[0] = new Book(0, "978-3-1600", "The Great Gatsby");
        booksArray[1] = new Book(1, "978-0-7432", "The Three Body Problem");
        booksArray[2] = new Book(2, "978-5-1403", "Divergent");
        booksArray[3] = new Book(3,"978-5-1403", "Divergent");
        booksArray[4] = new Book(4,"979-0-1738","The Dark Forest");
        booksArray[5] = new Book(5,"978-4-1313","All Tomorrows");
        booksArray[6] = new Book(6,"973-2-2768","Death's End");
        booksArray[7] = new Book(7,"978-2-4645","The Catcher in the Rye");
        booksArray[8] = new Book(8,"978-5-8964","Garfield");
        booksArray[9] = new Book(9,"978-3-1378","The Hitchhiker's Guide to the Galaxy");
        booksArray[10] = new Book(10,"12345678911", "Set Boundaries, Find Peace: a Guide to Reclaiming Yourself");
        booksArray[11] = new Book(11,"12345678912", "The Psychology of Money");
        booksArray[12] = new Book(12,"12345678913", "mindset The New Psychology of Success");
        booksArray[13] = new Book(13,"12345678914", "Outlive The Science & Art of Longegvity");
        booksArray[14] = new Book(14,"12345679815", "Ikigai The Japanese Secret to a Long and Happy Life");
        booksArray[15] = new Book(15,"12345678916", "The 5 AM Club");
        booksArray[16] = new Book(16,"12345678917", "The 48 Laws of Power");
        booksArray[17] = new Book(17,"12345678918", "The 7 Habits of Highly Effective People");
        booksArray[18] = new Book(18,"12345678919", "The Power of Now");
        booksArray[19] = new Book(19,"12345678920", "The Subtle Art of Not Giving a F*ck");
    }

    public void startMenu() {
        while (true) {
            System.out.println("\nLibrary Home Screen");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = read.nextInt();
            read.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    //showAvailableBooks();
                    break;
                case 2:
                    //showCheckedOutBooks();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}
