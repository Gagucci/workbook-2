package org.example;


public class Book {
    private int id;
    private String isbn;
    private String Title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.Title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = null;
    }

    public int getId() {return id;}
    public String getIsbn() {return isbn;}
    public String getTitle() {return Title;}
    public boolean isCheckedOut() {return isCheckedOut;}
    public String getCheckedOutTo() {return checkedOutTo;}

    public void checkOut(String _user) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = _user;
            System.out.println("Book checked out to " + _user);
        } else {
            System.out.println("Book is already checked out to " + checkedOutTo);
        }
    }

    public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            checkedOutTo = null;
            System.out.println("Book checked in.");
        } else {
            System.out.println("Book is already checked in.");
        }
    }
}
