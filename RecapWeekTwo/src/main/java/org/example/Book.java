package org.example;

public class Book {


    private String title;
    private String Author;
    private String TableOfContents;
    private String genre;
    private String ISBN;

    private int pageNumber;
    private int yearPublished;

    public Book(String _title, String _author,String _ISBN) {
        this.title = _title;
        this.Author = _author;
        this.ISBN = _ISBN;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTableOfContents() {
        return TableOfContents;
    }

    public void setTableOfContents(String tableOfContents) {
        TableOfContents = tableOfContents;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("Page number cannot be less than 1");
        } else {
            this.pageNumber = pageNumber;
        }
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void displayBookInfo() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + Author);
        System.out.println("ISBN:" + ISBN);
        System.out.println("Page Number:" + pageNumber);
        System.out.println("Year Published:" + yearPublished);
        System.out.println("Table of Contents:" + TableOfContents);
        System.out.println("Genre:" + genre);
    }

}
