package org.lifecycle;

public class Book {
    private int bookId;
    private String bookName;

    // default constructor
    public Book(){
        super();
    }
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        System.out.println("setter injection for id");
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        System.out.println("setter injection for name");
        this.bookName = bookName;
    }
    public void init(){
        System.out.println("init method");
    }
    public void destroy(){
        System.out.println("destroy method");
    }
}
