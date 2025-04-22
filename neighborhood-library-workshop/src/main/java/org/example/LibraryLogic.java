package org.example;
import java.util.Scanner;


public class LibraryLogic {

    Book[] booksArray = new Book[20];
    Scanner read = new Scanner(System.in);

    // Constructor to initialize the library
    public LibraryLogic() {
        initLibrary();
    }

    // initializes books array and loads 20 books upon library creation
    private void initLibrary() {
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

    // Method to display the library start menu, runs a while loop until the user chooses to exit
    public void startMenu() {
        while (true) {
            System.out.println("\nLibrary Home Screen");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = read.nextInt();
            read.nextLine();
            switch (choice) {
                case 1:
                    showAvailableBooks();
                    break;
                case 2:
                    showCheckedOutBooks();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Loop over the books array and display the available books (not checked out)
    private void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : booksArray) {
            if (!book.isCheckedOut()) {
                System.out.printf("ID: %d, ISBN: %s, Title: %s%n",
                        book.getId(), book.getIsbn(), book.getTitle());
            }
        }

        System.out.print("\nEnter book ID to check out or 0 to return: ");
        int bookId = read.nextInt();
        read.nextLine();

        if (bookId != 0) {
            System.out.print("Enter your name: ");
            String name = read.nextLine();
            checkOutBook(bookId, name);
        }
    }

    // Loop over the books array and display the checked out books
    private void showCheckedOutBooks() {
        System.out.println("\nChecked Out Books:");
        for (Book book : booksArray) {
            if (book.isCheckedOut()) {
                System.out.printf("ID: %d, ISBN: %s, Title: %s, Checked Out To: %s%n",
                        book.getId(), book.getIsbn(), book.getTitle(), book.getCheckedOutTo());
            }
        }

        System.out.print("\nEnter C to check in a book or X to return: ");
        String input = read.nextLine();

        if (input.equalsIgnoreCase("C")) {
            System.out.print("Enter book ID to check in: ");
            int bookId = read.nextInt();
            read.nextLine();
            checkInBook(bookId);
        }
    }

    private void checkOutBook(int bookId, String name) {
        for (Book book : booksArray) {
            if (book.getId() == bookId) {
                if (!book.isCheckedOut()) {
                    book.checkOut(name);
                    System.out.println("Book checked out successfully!");
                } else {
                    System.out.println("Book is already checked out!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    private void checkInBook(int bookId) {
        for (Book book : booksArray) {
            if (book.getId() == bookId) {
                if (book.isCheckedOut()) {
                    book.checkIn();
                    System.out.println("Book checked in successfully!");
                } else {
                    System.out.println("Book is not checked out!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}


